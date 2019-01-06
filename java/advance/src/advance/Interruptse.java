package advance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Interruptse extends JFrame{
	
	public Interruptse() {
		
		this.setTitle("打断演示");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JPanel panel = new JPanel(null);
		this.setContentPane(panel);
		
		//开始按钮
		JButton btnstart = new JButton("开始");
		btnstart.setSize(70, 30);
		btnstart.setLocation(10, 10);
		panel.add(btnstart);
		
		//取消按钮
		JButton btnstop = new JButton("取消");
		btnstop.setSize(70, 30);
		btnstop.setLocation(100, 10);
		panel.add(btnstop);
		
		//进度条
		JProgressBar bar = new JProgressBar(0, Integer.MAX_VALUE);
		bar.setSize(500,30);
		bar.setLocation(80, 100);
		panel.add(bar);
		bar.setValue(0);
		
		Thread t = new Thread() {
			public void run() {
				for(int i=1; i<=Integer.MAX_VALUE; i++) {
					bar.setValue(i);
					if(Thread.interrupted()) {
						break;
					}
				}
			}
		};
		
		//开始点击事件
		btnstart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.start();
				
			}
		});
		
		//取消点击事件
		btnstop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.interrupt();
			}
		});
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		Interruptse in = new Interruptse();

	}

}
