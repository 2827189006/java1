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
	// �û��ʺ�
	private String acccountNo;
	// �û�����
	private String password;
	// �������к�
	private int codeNumber;
	// ��ӭ��Ϣ
	private String wecomeInfo;

	/**
	 * ��ʾAtm�����Ļ�ӭ����
	 */
	public void welcomePage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out.println("|                   ��ӭʹ���й�����ATM               |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
	}

	/**
	 * ����������
	 */
	public void showMainPage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out
				.println("|                                                    |");
		System.out.println("|                   ��ӭʹ���й�����ATM                 |");
		System.out.println("|                              " + wecomeInfo
				+ "        |");
		System.out
				.println("|        1.ȡ��                                                                                                       |");
		System.out
				.println("|        2.��ѯ                                                                                                       |");
		System.out
				.println("|        3.ʵʱ���                                                                                               |");
		System.out
				.println("|        4.�ɷ�                                                                                                       |");
		System.out
				.println("|        5.ת��                                                                                                       |");
		System.out
				.println("|        6.�˳�                                                                                                        |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
	}

	/**
	 * ȡǮ����
	 */
	public double getMoney() {
		double money = 0;
		try {
			money = new Scanner(System.in).nextDouble();
		} catch (Exception e) {
			System.out.println("ֻ����������,�Ҳ���������ĸ");
			money = getMoneyPage();

		}
		if (money < 0) {
			System.out.println("ֻ����������");
			money = getMoneyPage();
		}
		if (money >= accountMap.get(acccountNo).getMoney()) {
			System.out.println("���㣬����������");
			money = getMoneyPage();
		}

		return money;

	}

	public double getMoneyPage() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out.print("|    ��������:");
		double moneys = getMoney();

		return moneys;
	}

	/**
	 * �����ʺź��������
	 */
	public void login() {
		System.out.print("�����������ʺţ�");
		acccountNo = new Scanner(System.in).next().trim();
		System.out.print("\n");
		System.out.print("�������������룺");
		password = new Scanner(System.in).next().trim();
		System.out.print("\n");

	}

	/**
	 * �ж��ʺź������Ƿ���ڣ��Ƿ���ȷ
	 * 
	 * @param account
	 *            �ʺ�
	 * @param pass
	 *            ����
	 * @return ACCOUNT_NOTFOUND��ʾ�ʺŲ�����,PASSWORD_ERROR��ʾ���벻��ȷ��PASSWORD_OK��ʾ���ڲ�����ȷ
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
	 * ������������
	 */
	public void restInputPassword() {
		System.out.println("���벻��ȷ��");
		System.out.print("��������������:");
		password = scanner.next();
		System.out.print("\n");
	}

	/**
	 * ����ATM
	 */
	public void startAtm() {
		// Ĭ���ʺŴ���
		boolean isAccountExist = true;
		// Ĭ��������ȷ
		boolean isPasswordOk = true;
		welcomePage(); // ���뻶ӭ����
		login();// �����û������������
		// ��֤�û����,���ض�Ӧ��״̬��
		int codeStatu = isExistAccountNo(acccountNo, password);

		switch (codeStatu) {
		case ACCOUNT_NOTFOUND:
			isAccountExist = false;
			while (!isAccountExist) {
				System.out.println("���ʺŲ����ڣ�");
				login();
				codeStatu = isExistAccountNo(acccountNo, password);
				if (codeStatu != 0) {
					// ����ʺŴ��ھ�����ѭ��
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
						System.out.println("����������3�Σ�Ϊ�˱�֤���ĲƲ���ȫ������������!");
						System.exit(0);
					}
					restInputPassword();
					codeStatu = isExistAccountNo(acccountNo, password);

					if (codeStatu != 1) {
						// ����ʺŴ��ھ�����ѭ��
						isPasswordOk = true;
					}
				}
			}

		case PASSWORD_OK:
			Account account = accountMap.get(acccountNo);
			String first_name = account.getName().substring(0, 1);
			if ("man".equals(account.getSex())) {
				wecomeInfo = first_name + "��������!";
			} else {
				wecomeInfo = first_name + "Ůʿ����!";
			}

			mainPage();

		}
	}

	/**
	 * ����ѡ������к�
	 * 
	 * @return ���к�
	 */
	public int inputNumberSerializ() {
		System.out.print("�����빦�����к�:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("ֻ�����루1-6��֮��������,�Ҳ���������ĸ");
			System.out.print("�����빦�����к�:");
			number = inputNumberSerializ();

		}
		if (number <= 0 || number > 6) {
			System.out.println("ֻ�����루1-6��֮��������,�Ҳ���������ĸ");
			number = inputNumberSerializ();
		}

		System.out.print("\n");
		return number;
	}

	public int inputSecondReturnParam() {
		System.out.print("�����빦�����к�:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("ֻ����������,�Ҳ���������ĸ");
			System.out.print("�����빦�����к�:");
			number = inputSecondReturnParam();

		}
		if (number < 0) {
			System.out.println("ֻ����������");
			number = inputSecondReturnParam();
		}
		System.out.print("\n");
		return number;
	}

	/**
	 * ���߳���Ϣ3��
	 */
	@SuppressWarnings("static-access")
	public void pause() {
		try {
			Thread.currentThread().sleep(3000);
		} catch (Exception e) {
		}
	}

	/**
	 * ��ʾ����
	 */
	public void showProgess() {
		System.out
				.println("|----------------------------------------------------");
		System.out
				.println("|                                                    |");
		System.out.println("|        ���ڴ���,���Ժ�......                         |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
		pause();

	}

	/**
	 * ��֤�����
	 * 
	 * @return ����������ȷ�ĵĴ�������Ϊ����
	 */
	public int inputMoneyNum() {
		System.out.print("��������:");
		int number = 0;
		try {
			number = new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.out.println("ֻ����������,�Ҳ���������ĸ");
			System.out.print("����������:");
			number = inputMoneyNum();

		}
		if (number < 0) {
			System.out.println("ֻ������������");
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
				.println("|       1.�ֻ���ֵ                                                                                                                               |");
		System.out
				.println("|       2.����                                                                                                                                       |");
		System.out
				.println("|----------------------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
	}

	/**
	 * ���������Ϣ����
	 * 
	 * @param info
	 *            ��Ϣ�ַ���
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
		// codeNumber==1,��ʾȡ��
		// System.out.println(codeNumber);
		while (codeNumber != 6) {
			// ȡǮ
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
				// ȡǮ����
				Account a = accountMap.get(acccountNo);
				a.setMoney(a.getMoney() - money);
				accountMap.put(acccountNo, a);

				showProgess();
				pause();
				info = "���׳ɹ�!";
				successfullPage(info);
				pause();
				showMainPage();
				codeNumber = inputNumberSerializ();
			}
			// ��ѯ
			if (codeNumber == 2) {
				showProgess();
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  ��ǰ�ʻ�:" + acccountNo
						+ "                             |");
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  ��ǰ��Ͷ�:"
						+ accountMap.get(acccountNo).getMoney() + "RMB" + " |");
				System.out
						.println("|                                                    |");
				System.out
						.println("|  1.����                                                                                                                                                       |");
				System.out
						.println("|----------------------------------------------------");
				int keycode = inputSecondReturnParam();
				while (keycode <= 0 || keycode > 1) {
					System.out.println("ֻ��������ȷ����ţ�����ѡ��!");
					keycode = inputSecondReturnParam();
				}

				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// ʵʱ���
			if (codeNumber == 3) {
				int money = inputMoneyNum();
				Account a = accountMap.get(acccountNo);
				a.setMoney(a.getMoney() + money);
				accountMap.put(a.getAccountNo(), a);
				showProgess();
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  ��ǰ�ʻ�:" + acccountNo
						+ "                             |");
				System.out
						.println("|----------------------------------------------------");
				System.out.println("|  ���δ�����: " + money
						+ "                             |");
				System.out
						.println("|                                                    |");
				System.out.println("|  ��ǰ��Ͷ�:" + a.getMoney() + "RMB" + " |");
				System.out
						.println("|                                                    |");
				System.out
						.println("|  1.����                                                                                                                                                       |");
				System.out
						.println("|----------------------------------------------------");

				int keycode = inputSecondReturnParam();
				while (keycode <= 0 || keycode > 1) {
					System.out.println("ֻ��������ȷ����ţ�����ѡ��!");
					keycode = inputSecondReturnParam();
				}

				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// �ɷ�
			if (codeNumber == 4) {
				JiaoFiePage();
				int keycode = inputNumberSerializ();
				while (keycode < 0 || keycode > 3) {
					System.out.println("������(1-2֮���������)");
					keycode = inputNumberSerializ();
				}
				while (keycode != 2) {
					int money = inputMoneyNum();
					Account a = accountMap.get(acccountNo);
					while (money >= a.getMoney()) {
						System.out.println("����!");
						money = inputMoneyNum();

					}
					a.setMoney(a.getMoney() - money);
					accountMap.put(a.getAccountNo(), a);

					showProgess();
					info = "�ɷѳɹ�!";
					successfullPage(info);

					JiaoFiePage();
					keycode = inputNumberSerializ();
					while (keycode < 0 || keycode > 3) {
						System.out.println("������(1-2֮���������)");
						keycode = inputNumberSerializ();
					}

				}

				// ѡ��2ѡ���˻���ҳ
				showMainPage();
				codeNumber = inputNumberSerializ();

			}

			// ת��
			if (codeNumber == 5) {
				boolean isAccountExist = false;
				String otheracccountNo = null;
				while (!isAccountExist) {
					System.out.print("���������Է����ʺţ�");
					otheracccountNo = new Scanner(System.in).next().trim();
					if (accountMap.get(otheracccountNo) == null) {
						System.out.println("�ʺŲ�����");

					} else if (acccountNo.equals(accountMap
							.get(otheracccountNo))) {
						System.out.println("����ѡ���Լ����ʺ�,��ѡ�������ʺ�!");
					} else {
						isAccountExist = true;
					}
				}
				int money = inputMoneyNum();
				Account a = accountMap.get(acccountNo);
				while (money >= a.getMoney()) {
					System.out.println("����!");
					money = inputMoneyNum();
				}
				Account b = accountMap.get(otheracccountNo);
				a.setMoney(a.getMoney() - money);
				b.setMoney(b.getMoney() + money);
				accountMap.put(acccountNo, a);
				accountMap.put(otheracccountNo, b);
				showProgess();
				info = "ת�ʳɹ�!";
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
				.println("|       �˳��ɹ�����ӭ���ٴ�ʹ��ATM!                           |");
		System.out
				.println("|                                                    |");
		System.out
				.println("|----------------------------------------------------");

	}

	public static void main(String[] args) {
		Account a = new Account("123456789", "123456", "����", "man", 5000.23);
		Account a1 = new Account("123123456", "654321", "����", "female", 2000.25);
		accountMap.put(a.getAccountNo(), a);
		accountMap.put(a1.getAccountNo(), a1);
		AtmSystem atmSystem = new AtmSystem();
		atmSystem.startAtm();
	}

}
