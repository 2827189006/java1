package test;

	import java.util.List;
	public interface GifeDao {

		/**
		 * 保存一个积分商品
		 * */
		void addGifesComm(Gifes g);
		/**
		 * 显示所有商品
		 * */
		List<Gifes> selAllComm();
		/**
		 * 传入ID查找商品
		 * */
		Gifes findComm(int gid);
		/**
		 * 修改积分
		 * */
		void updateGife(Gifes g);
		/**
		 * 删除商品
		 * */
		void delComm(int  gid);
	}

