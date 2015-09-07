package game.java;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
	
	/*
	<applet code="game2" width=200 height=300>
	</applet>
	*/
	public class game2 extends Applet implements ActionListener,ItemListener, Runnable{

	Button a;Button b;Button c;Button q;Button w;Button e;Button r;Button t;Button y;public static Button u;Button p;Button l;Button m;Button o;Button k;Choice level;

static int xy;

	int posY1=0,posY2=0,posY3=0,posY4=0,posY5=0,posY6=0;int aq=0;

	public void init() {a=new Button("start");b=new Button("pause");c=new Button("score");q=new Button("let see1");w=new Button("let see2");e=new Button("let see3");r=new Button("let see4");t=new Button("let see5");y=new Button("let see6");u=new Button("enemy");p=new Button("enemy");l=new Button("enemy");m=new Button("enemy");o=new Button("enemy");k=new Button("enemy");
	add(a);add(b);add(c);add(q);add(w);add(e);add(r);add(t);add(y);add(u);add(p);add(l);add(m);add(o);add(k);
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
	q.addActionListener(this);
	w.addActionListener(this);
	e.addActionListener(this);
	r.addActionListener(this);
	t.addActionListener(this);
	y.addActionListener(this);
	level = new Choice();
	level.add("level 1");level.add("level 2");level.add("level 3");level.add("level 4");	
	add(level);
	level.addItemListener(this);
		
	                   }
	public void itemStateChanged(ItemEvent ie) {
		if("level 1" == level.getSelectedItem())xy=1500;
		if("level 2" == level.getSelectedItem())xy=1000;
		if("level 3" == level.getSelectedItem())xy=750;if("level 4" == level.getSelectedItem())xy=500;
	
		}
	public void run(){posY1=0;posY2=0;posY3=0;posY4=0;posY5=0;posY6=0;

		while(true){if(posY1==450||posY2==450||posY3==450||posY4==450||posY5==450||posY6==450){System.out.println(aq);	break;	}	
		        posY1+=50;posY2+=50;posY3+=50;posY4+=50;posY5+=50;posY6+=50;
			repaint();
			aq++;
			try{Thread.sleep(xy);}
			catch(Exception e){
			}
		}
	}
	public void actionPerformed(ActionEvent ae) {
	String str = ae.getActionCommand();
	if(str.equals("start")){Thread T=new Thread(this);T.start();aq=0;}
	if(str.equals("let see1")){remove(u);posY1=0;add(p);add(l);add(m);add(o);add(k);}
	if(str.equals("let see2")){remove(p);posY2=0;add(u);add(l);add(m);add(o);add(k);}
	if(str.equals("let see3")){remove(l);posY3=0;add(p);add(u);add(m);add(o);add(k);}
	if(str.equals("let see4")){remove(m);posY4=0;add(p);add(l);add(u);add(o);add(k);}
	if(str.equals("let see5")){remove(o);posY5=0;add(p);add(l);add(m);add(u);add(k);}
	if(str.equals("let see6")){remove(k);posY6=0;add(p);add(l);add(m);add(o);add(u);}
	                                            }

	public void paint(Graphics g){
	if(posY1==450||posY2==450||posY3==450||posY4==450||posY5==450||posY6==450)g.drawString("game over and your score    "+aq+"   ",500,400);
	q.setSize(50,50);q.setLocation(30,500);a.setLocation(600,100);b.setLocation(650,100);c.setLocation(700,100);
	w.setSize(50,50);w.setLocation(80,500);
	e.setSize(50,50);e.setLocation(130,500);
	r.setSize(50,50);r.setLocation(180,500);
	t.setSize(50,50);t.setLocation(230,500);
	y.setSize(50,50);y.setLocation(280,500);
	u.setSize(50,50);p.setSize(50,50);l.setSize(50,50);m.setSize(50,50);o.setSize(50,50);k.setSize(50,50);
	u.setLocation(30,posY1);
	p.setLocation(80,posY2); 
	l.setLocation(130,posY3);
	m.setLocation(180,posY4);
	o.setLocation(230,posY5);
	k.setLocation(280,posY6);
	}



	}
