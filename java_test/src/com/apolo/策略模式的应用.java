package java1000��;

/*����ģʽ���ñ�ͼƬ���Ա���Ϊ��ͬ��ʽ��ͼƬ��ѡ��ͬ��ͼƬ���б��棨����+������
 * */

//���屣��Ľ�ڣ���Ϊ���治ͬ�ĸ�ʽ����Ҫ��save�ķ���
//���岻ͬ�ĸ�ʽ���࣬ʵ��save����
//����ͼƬѡ����࣬���淵�ز�ͬ�����ʵ��
//���Է���

 interface ImageSaver{
	public void save();//�ӿ��еķ�����������Ϊpublic,Ĭ����public
}
 
 
 class GIFSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("�ѱ���ΪGIF��ʽ"); 
	 }
 }
 
 class PNGSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("�ѱ���ΪPNG��ʽ"); 
	 }
 }
 
 class JPEGSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("�ѱ���ΪJPEG��ʽ"); 
	 }
 }
 
 
 //ע�����ķ�������ʦ�ӿڣ���Ϊÿ�εķ��ص����Ͷ��̳���ImageSaver����ӿڣ��ӿ����ֲ�ͬ��save����
 class TypeChooser{
	 public static ImageSaver  getSaver(String type){
		 if("GIF".equals(type)) return new GIFSaver();
		 else if("PNG".equals(type)) return new PNGSaver();
		 else return new JPEGSaver();
	 }
 }
 

public class ����ģʽ��Ӧ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����ΪGIF��ʽ��");
		ImageSaver type = TypeChooser.getSaver("GIF");
		type.save();
		System.out.println("����ΪPNG��ʽ��");
		type = TypeChooser.getSaver("PNG");
		type.save();
		System.out.println("����ΪJPEG��ʽ��");
		type = TypeChooser.getSaver("JPEG");
		type.save();
	}

}
