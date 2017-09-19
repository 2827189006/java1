package cn.test.atm;

import java.util.Map;
import java.util.Scanner;

import cn.test.atm.daomain.Account;
import cn.test.atm.database.DataBase;

public class AtmSystem {

	private static final int ACCOUNT_NOTFOUND = 0;
	private static final int PASSWORD_ERROR = 1;
	private static final int PASSWORD_OK = 2;
	private static Map<String, Account> accountMap = DataBase.getDataBase()
			.getAccountMap();
	private Scanner scanner = new Scanner(System.in);
	// 用户帐号
	private String acccountNo;
	// 用户密码
	private String password;
	// 功能序列号
	private int codeNumber;
	// 欢迎信息
	private String wecomeInfo;

	/**
	 * 显示Atm提款机的欢迎界面
	 */
	public void welcomePage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out.println("|                   欢迎使用中国建行ATM               |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
	}

	/**
	 * 提款机主界面
	 */
	public void showMainPage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out.println("|                   欢迎使用中国建行ATM                 |");
		System.out.println("|                              " + wecomeInfo
				+ "        |");
		System.out
				.println("|        1.取款                                                                                                       |");
		System.out
				.println("|        2.查询                                                                                                       |");
		System.out
				.println("|        3.实时存款                                                                                               |");
		System.out
				.println("|        4.缴费                                                                                                       |");
		System.out
				.println("|        5.转帐                                                                                                       |");
		System.out
				.println("|        6.退出                                                                                                        |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
	}

	/**
	 * 取钱方法
	 */
	public double getMoney() {
		double money = 0;
		try {
			money = new Scanner(System.in).nextDouble();
		} catch (Exception e) {
			System.out.println("只能输入数字,且不能输入字母");
			money = getMoneyPage();

		}
		if (money < 0) {
			System.out.println("只能输入正数");
			money = getMoneyPage();
		}
		if (money >= accountMap.get(acccountNo).getMoney()) {
			System.out.println("余额不足，请重新输入");
			money = getMoneyPage();
		}

		return money;

	}

	public double getMoneyPage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out.print("|    请输入金额:");
		double moneys = getMoney();

		return moneys;
	}

	/**
	 * 输入帐号和密码界面
	 */
	public void login() {
		System.out.print("请输入您的帐号：");
		acccountNo = new Scanner(System.in).next().trim();
		System.out.print("\n");
		System.out.print("请输入您的密码：");
		password = new Scanner(System.in).next().trim();
		System.out.print("\n");

	}

	/**
	 * 判断帐号和密码是否存在，是否正确
	 * 
	 * @param account
	 *            帐号
	 * @param pass
	 *            密码
	 * @return ACCOUNT_NOTFOUND表示帐号不存在,PASSWORD_ERROR表示密码不正确，PASSWORD_OK表示存在并且正确
	 */
	public int isExistAccountNo(String account, String pass) {

		// Map<String,Account>
		// accountMap=DataBase.getDataBase().getAccountMap();
		if (pass.length() > 6)
			pass = pass.substring(0, 6);
		if (accountMap.get(account) == null) {
			return ACCOUNT_NOTFOUND;
		} else if (!pass.equals(accountMap.get(account).getPassword())) {
			return PASSWORD_ERROR;
		}
		return PASSWORD_OK;

	}

	/**
	 * 重新输入密码
	 */
	public void restInputPassword() {
		System.out.println("密码不正确！");
		System.out.print("请重新输入密码:");
		password = scanner.next();
		System.out.print("\n");
	}

	/**
	 * 启动ATM
	 */
	public void startAtm() {
		// 默认帐号存在
		boolean isAccountExist = true;
		// 默认密码正确
		boolean isPasswordOk = true;
		welcomePage(); // 进入欢迎界面
		login();// 输入用户名和密码界面
		// 验证用户身份,返回对应的状态码
		int codeStatu = isExistAccountNo(acccountNo, password);

		switch (codeStatu) {
		case ACCOUNT_NOTFOUND:
			isAccountExist = false;
			while (!isAccountExist) {
				System.out.println("该帐号不存在！");
				login();
				codeStatu = isExistAccountNo(acccountNo, password);
				if (codeStatu != 0) {
					// 如果帐号存在就跳出循环
					isAccountExist = true;
				}

			}

		case PASSWORD_ERROR:

			if (codeStatu == 1) {
				int count = 1;
				isPasswordOk = false;
				while (!isPasswordOk) {
					count = count + 1;
					if (count > 3) {
						System.out.println("密码已输入3次，为了保证您的财产安全，请明天再试!");
						System.exit(0);
					}
					restInputPassword();
					codeStatu = isExistAccountNo(acccountNo, password);

					if (codeStatu != 1) {
						// 如果帐号存在就跳出循环
						isPasswordOk = true;
					}
				}
			}

		case PASSWORD_OK:
			Account account = accountMap.get(acccountNo);
			String first_name = account.getName().substring(0, 1);
			if ("man".equals(account.getSex())) {
				wecomeInfo = first_name + "先生您好!";
			} else {
				wecomeInfo = first_name + "女士您好!";
			}

			mainPage();

		}
	}

	/**
	 * 请输选择的序列号
	 * 
	 * @return 序列号
	 */
	public int inputNumberSerializ() {
		System.out.print("请输入功能序列号:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("只能输入（1-6）之间有整数,且不能输入字母");
			System.out.print("请输入功能序列号:");
			number = inputNumberSerializ();

		}
		if (number <= 0 || number > 6) {
			System.out.println("只能输入（1-6）之间有整数,且不能输入字母");
			number = inputNumberSerializ();
		}

		System.out.print("\n");
		return number;
	}

	public int inputSecondReturnParam() {
		System.out.print("请输入功能序列号:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("只能输入整数,且不能输入字母");
			System.out.print("请输入功能序列号:");
			number = inputSecondReturnParam();

		}
		if (number < 0) {
			System.out.println("只能输入整数");
			number = inputSecondReturnParam();
		}
		System.out.print("\n");
		return number;
	}

	/**
	 * 让线程休息3秒
	 */
	@SuppressWarnings("static-access")
	public void pause() {
		try {
			Thread.currentThread().sleep(3000);
		} catch (Exception e) {
		}
	}

	/**
	 * 提示界面
	 */
	public void showProgess() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out.println("|        正在处理,请稍后......                         |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
		pause();

	}

	/**
	 * 验证存款金额
	 * 
	 * @return 返回输入正确的的存款金额，金额不能为负数
	 */
	public int inputMoneyNum() {
		System.out.print("请输入金额:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("只能输入整数,且不能输入字母");
			System.out.print("请输入存款金额:");
			number = inputMoneyNum();

		}
		if (number < 0) {
			System.out.println("只能输入正整数");
			number = inputMoneyNum();
		}
		System.out.print("\n");
		return number;
	}

	public void JiaoFiePage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|       1.手机充值                                                                                                                               |");
		System.out
				.println("|       2.返回                                                                                                                                       |");
		System.out
				.println("|----------------------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
	}

	/**
	 * 输出最终消息界面
	 * 
	 * @param info
	 *            消息字符串
	 */
	public void successfullPage(String info) {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out.println("|      " + info + "|");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
	}

	public void mainPage() {
		String info = "";
		showMainPage();
		codeNumber = inputNumberSerializ();
		// codeNumber==1,表示取款
		// System.out.println(codeNumber);
		while (codeNumber != 6) {
			// 取钱
			if (codeNumber == 1) {
				double money = getMoneyPage();
				System.out.print("\n");
				System.out
						.println("|                                                    |");
				System.out
						.println("|----------------------------------------------------|");

				System.out.print("\n");
				System.out.print("\n");
				System.out.print("\n");
				// 取钱设置
				Account a = accountMap.get(acccountNo);
				a.setMoney(a.getMoney() - money);
				accountMap.put(acccountNo, a);

				showProgess();
				pause();
				info = "交易成功!";
				successfullPage(info);
				pause();
				showMainPage();
				codeNumber = inputNumberSerializ();
			}
			// 查询
			if (codeNumber == 2) {
				showProgess();
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  当前帐户:" + acccountNo
						+ "                             |");
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  当前余客额:"
						+ accountMap.get(acccountNo).getMoney() + "RMB" + " |");
				System.out
						.println("|                                                    |");
				System.out
						.println("|  1.返回                                                                                                                                                       |");
				System.out
						.println("|----------------------------------------------------");
				int keycode = inputSecondReturnParam();
				while (keycode <= 0 || keycode > 1) {
					System.out.println("只能输入正确的序号，进行选择!");
					keycode = inputSecondReturnParam();
				}

				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// 实时存款
			if (codeNumber == 3) {
				int money = inputMoneyNum();
				Account a = accountMap.get(acccountNo);
				a.setMoney(a.getMoney() + money);
				accountMap.put(a.getAccountNo(), a);
				showProgess();
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  当前帐户:" + acccountNo
						+ "                             |");
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  本次存入金额: " + money
						+ "                             |");
				System.out
						.println("|                                                    |");
				System.out.println("|  当前余客额:" + a.getMoney() + "RMB" + " |");
				System.out
						.println("|                                                    |");
				System.out
						.println("|  1.返回                                                                                                                                                       |");
				System.out
						.println("|----------------------------------------------------");

				int keycode = inputSecondReturnParam();
				while (keycode <= 0 || keycode > 1) {
					System.out.println("只能输入正确的序号，进行选择!");
					keycode = inputSecondReturnParam();
				}

				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// 缴费
			if (codeNumber == 4) {
				JiaoFiePage();
				int keycode = inputNumberSerializ();
				while (keycode < 0 || keycode > 3) {
					System.out.println("请输入(1-2之间的正整数)");
					keycode = inputNumberSerializ();
				}
				while (keycode != 2) {
					int money = inputMoneyNum();
					Account a = accountMap.get(acccountNo);
					while (money >= a.getMoney()) {
						System.out.println("余额不足!");
						money = inputMoneyNum();

					}
					a.setMoney(a.getMoney() - money);
					accountMap.put(a.getAccountNo(), a);

					showProgess();
					info = "缴费成功!";
					successfullPage(info);

					JiaoFiePage();
					keycode = inputNumberSerializ();
					while (keycode < 0 || keycode > 3) {
						System.out.println("请输入(1-2之间的正整数)");
						keycode = inputNumberSerializ();
					}

				}

				// 选择2选项退回主页
				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// 转帐
			if (codeNumber == 5) {
				boolean isAccountExist = false;
				String otheracccountNo = null;
				while (!isAccountExist) {
					System.out.print("请输入您对方的帐号：");
					otheracccountNo = new Scanner(System.in).next().trim();
					if (accountMap.get(otheracccountNo) == null) {
						System.out.println("帐号不存在");

					} else if (acccountNo.equals(accountMap
							.get(otheracccountNo))) {
						System.out.println("不能选择自己的帐号,请选择其它帐号!");
					} else {
						isAccountExist = true;
					}
				}
				int money = inputMoneyNum();
				Account a = accountMap.get(acccountNo);
				while (money >= a.getMoney()) {
					System.out.println("余额不足!");
					money = inputMoneyNum();
				}
				Account b = accountMap.get(otheracccountNo);
				a.setMoney(a.getMoney() - money);
				b.setMoney(b.getMoney() + money);
				accountMap.put(acccountNo, a);
				accountMap.put(otheracccountNo, b);
				showProgess();
				info = "转帐成功!";
				successfullPage(info);
				pause();
				showMainPage();
				codeNumber = inputNumberSerializ();

			}

		}

		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|       退出成功，欢迎你再次使用ATM!                           |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");

	}

	public static void main(String[] args) {
		Account a = new Account("123456789", "123456", "张三", "man", 5000.23);
		Account a1 = new Account("123123456", "654321", "李四", "female", 2000.25);
		accountMap.put(a.getAccountNo(), a);
		accountMap.put(a1.getAccountNo(), a1);
		AtmSystem atmSystem = new AtmSystem();
		atmSystem.startAtm();
	}

}
