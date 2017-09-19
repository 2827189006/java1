package test;


import java.util.List;
import java.util.Scanner;



/**
 * 积分管理
 * */
public class GifeService {
	private static final GifeDao GifeDao = null;
	private Scanner sc=new Scanner(System.in);
	private GifeDao gd= GifeDao;
	/**
	 * 显示积分主页面
	 * */
	public void showGifesMain(){
		System.out.println(" 书店管理销售系统 >> 积分管理    ");
		System.out.println("**************************************");
		System.out.println("*           \t1.显示积分商品                         *");
		System.out.println("*           \t2.添加商品                                   *");
		System.out.println("*           \t3.修改积分规则                         *");
		System.out.println("*           \tm.按任意键返回上级               *");
		System.out.println("**************************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		if("1".equals(input)){
			this.showAllGifeComm();
		}else if("2".equals(input)){
			this.addGifesComm();
		}else if("3".equals(input)){
			System.out.println("修改积分规则");
		}else{
			AdminService as=new AdminService();
			as.adminManage();
		}
	}
	/**
	 * 显示所有积分商品
	 * */
	private void showAllGifeComm() {
		System.out.println(" 书店管理销售系统 >> 积分管理  >>显示积分商品 ");
		System.out.println("商品ID\t商品名称\t\t商品所需积分");
		//调用显示所有商品的方法
		List<Gifes> gifes=gd.selAllComm();
		for(Gifes g:gifes){
			System.out.println(g.getGid()+"\t"+g.getGid()+"\t\t"+g.getGid());
		}
		System.out.println("**********************************");
		System.out.println("*           \t1.修改商品                         *");
		System.out.println("*           \t2.删除商品                         *");
		System.out.println("*           \tm.按任意键返回上级     *");
		System.out.println("**********************************");
		System.out.print("请选择操作:");
		String input=sc.next();
		if("1".equals(input)){
			this.updateComm();
		}else if("2".equals(input)){
			this.delComm();
		}else{
			this.showGifesMain();
		}
	}
	/**
	 * 删除商品
	 * */
	private void delComm() {
		System.out.println(" 书店管理销售系统 >> 积分管理  >>显示积分商品 >>删除商品");
		System.out.println("请输入要删除商品的ID:");
		int gid=sc.nextInt();
		//判断商品ID是否存在
		Gifes g=gd.findComm(gid);
		while(g==null){
			System.out.println("您输入的ID有误，请重新输入!");
			gid=sc.nextInt();
			g=gd.findComm(gid);
		}
		gd.findComm(gid);
		System.out.println("*************************");
		System.out.println("*      \t删除完毕!      *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
	/**
	 * 修改商品
	 * */
	private void updateComm() {
		System.out.println(" 书店管理销售系统 >> 积分管理  >>显示积分商品 >>修改商品");
		System.out.println("请输入要修改商品的ID:");
		int gid=sc.nextInt();
		//判断商品ID是否存在
		Gifes g=gd.findComm(gid);
		while(g==null){
			System.out.println("您输入的ID有误，请重新输入!");
			gid=sc.nextInt();
			g=gd.findComm(gid);
		}
		//显示这个商品的详细信息
		System.out.println("商品ID:"+g.getGid()+"\t商品名称:"+g.getGid());
		System.out.println("商品积分:"+g.getGid());
		//修改商品
		System.out.println("请输入您要修改后商品的积分:");
		int gife=sc.nextInt();
		try {
			while(gife<0){
				System.out.println("你输入的积分有误。请重新输入：");
				gife=sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println("你输入的积分有误。请重新输入：");
			this.updateComm();
		}
		//把修改后的属性放入到对象中
		g.setGife(gife);
		//执行修改
		gd.updateGife(g);
		System.out.println("*************************");
		System.out.println("*      \t修改完毕!      *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
	/**
	 * 添加积分商品
	 * */
	private void addGifesComm() {
		System.out.println(" 书店管理销售系统 >> 积分管理  >>添加积分商品  ");
		System.out.println("请输入添加商品的名称:");
		System.out.println("请输入添加商品所需积分:");
		Gifes g=new Gifes();
		gd.addGifesComm(g);
		System.out.println("*************************");
		System.out.println("*     \t添加商品成功!    *");
		System.out.println("*************************");
		this.showAllGifeComm();
	}
}
