package test;

	import java.util.List;
	public interface GifeDao {

		/**
		 * ����һ��������Ʒ
		 * */
		void addGifesComm(Gifes g);
		/**
		 * ��ʾ������Ʒ
		 * */
		List<Gifes> selAllComm();
		/**
		 * ����ID������Ʒ
		 * */
		Gifes findComm(int gid);
		/**
		 * �޸Ļ���
		 * */
		void updateGife(Gifes g);
		/**
		 * ɾ����Ʒ
		 * */
		void delComm(int  gid);
	}

