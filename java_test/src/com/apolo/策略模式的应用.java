package java1000例;

/*策略模式：好比图片可以保存为不同格式的图片，选择不同的图片进行保存（策略+工厂）
 * */

//定义保存的借口，因为保存不同的格式都需要有save的方法
//定义不同的格式的类，实现save方法
//定义图片选择的类，里面返回不同的类的实例
//测试方法

 interface ImageSaver{
	public void save();//接口中的方法必须声明为public,默认是public
}
 
 
 class GIFSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("已保存为GIF格式"); 
	 }
 }
 
 class PNGSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("已保存为PNG格式"); 
	 }
 }
 
 class JPEGSaver implements ImageSaver{
	 @Override
	 public void save(){
		System.out.println("已保存为JPEG格式"); 
	 }
 }
 
 
 //注意最后的返回类型师接口，因为每次的返回的类型都继承了ImageSaver这个接口，接口有又不同的save方法
 class TypeChooser{
	 public static ImageSaver  getSaver(String type){
		 if("GIF".equals(type)) return new GIFSaver();
		 else if("PNG".equals(type)) return new PNGSaver();
		 else return new JPEGSaver();
	 }
 }
 

public class 策略模式的应用 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("保存为GIF格式：");
		ImageSaver type = TypeChooser.getSaver("GIF");
		type.save();
		System.out.println("保存为PNG格式：");
		type = TypeChooser.getSaver("PNG");
		type.save();
		System.out.println("保存为JPEG格式：");
		type = TypeChooser.getSaver("JPEG");
		type.save();
	}

}
