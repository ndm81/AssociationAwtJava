import java.awt.*;
class AssoAwt{
	AssoAwt(){
		Frame f=new Frame();
		Button b=new Button("Click me");
		b.setBounds(80,100,80,30);
		f.add(b);
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		AssoAwt a=new AssoAwt();
	}

}