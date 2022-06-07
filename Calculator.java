
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.MediaSize.ISO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	Boolean isOperatorClicked=false;
	Boolean isOperatorClickedAdd=false;
	Boolean isOperatorClickedMulti=false;
	Boolean isOpratorClickedSub=false;
	String oldValue;
	String newValue;
	JFrame jf;
	JLabel jl;
	JButton numSeven;
	JButton numEight;
	JButton numNine;
	JButton numFour;
	JButton numFive;
	JButton numSix;
	JButton numOne;
	JButton numTwo;
	JButton numThree;
	JButton numDot;
	JButton numZero;
	JButton Equal;
	JButton divButton;
	JButton multiButton;
	JButton minusButton;
	JButton addButton;
	JButton clearButton;

	public Calculator() {
	    jf=new JFrame("Calculator");
		jf.setSize(500,600);
		jf.setLayout(null);
		jf.setLocation(500,130);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl=new JLabel();
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jl.setFont(new Font(null, 0, 24));
		LayoutManager layout=new FlowLayout();
		jl.setLayout(layout);
		jl.setBounds(20,20,440,70);
		jl.setBackground(Color.LIGHT_GRAY);
		jl.setOpaque(true);
		
		numSeven=new JButton("7");
		numSeven.setBounds(20,110,100,70);
		numSeven.setVisible(true);
		numSeven.setFont(new Font(null, 0,24));
		jf.add(numSeven);
		numSeven.addActionListener(this);
		
	    numEight=new JButton("8");
		numEight.setBounds(130,110,100,70);
		jf.add(numEight);
		numEight.setFont(new Font(null, 0,24));
		numEight.setVisible(true);
		numEight.addActionListener(this);
		
		numNine=new JButton("9");
		numNine.setBounds(240,110,100,70);
		jf.add(numNine);
		numNine.setFont(new Font(null, 0,24));
		numNine.setVisible(true);
		numNine.addActionListener(this);
		
		numFour=new JButton("4");
		numFour.setBounds(20,200,100,70);
		jf.add(numFour);
		numFour.setFont(new Font(null, 0,24));
		numFour.setVisible(true);
		numFour.addActionListener(this);
		
		numFive=new JButton("5");
		numFive.setBounds(130,200,100,70);
		jf.add(numFive);
		numFive.setFont(new Font(null, 0,24));
		numFive.setVisible(true);
		numFive.addActionListener(this);
		
		numSix=new JButton("6");
		numSix.setBounds(240,200,100,70);
		jf.add(numSix);
		numSix.setFont(new Font(null, 0,24));
		numSix.setVisible(true);
		numSix.addActionListener(this);
		
		numOne=new JButton("1");
		numOne.setBounds(20,290,100,70);
		jf.add(numOne);
		numOne.setFont(new Font(null, 0,24));
		numOne.setVisible(true);
		numOne.addActionListener(this);
		
		numTwo=new JButton("2");
		numTwo.setBounds(130,290,100,70);
		jf.add(numTwo);
		numTwo.setFont(new Font(null, 0,24));
		numTwo.setVisible(true);
		numTwo.addActionListener(this);
		
		numThree=new JButton("3");
		numThree.setBounds(240,290,100,70);
		jf.add(numThree);
		numThree.setFont(new Font(null, 0,24));
		numThree.setVisible(true);
		numThree.addActionListener(this);
		
		numDot=new JButton(".");
		numDot.setBounds(20,380,100,70);
		jf.add(numDot);
		numDot.setFont(new Font(null, 0,24));
		numDot.setVisible(true);
		numDot.addActionListener(this);
		
		numZero=new JButton("0");
		numZero.setBounds(130,380,100,70);
		jf.add(numZero);
		numZero.setFont(new Font(null, 0,24));
		numZero.setVisible(true);
		numZero.addActionListener(this);
		
		Equal=new JButton("=");
		Equal.setBounds(240,380,100,70);
		jf.add(Equal);
		Equal.setFont(new Font(null, 0,24));
		Equal.setVisible(true);
		Equal.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(350,110,100,70);
		jf.add(divButton);
		divButton.setFont(new Font(null, 0,24));
		divButton.setVisible(true);
		divButton.addActionListener(this);
		
		multiButton=new JButton("x");
		multiButton.setBounds(350,200,100,70);
		jf.add(multiButton);
		multiButton.setFont(new Font(null, 0,24));
		multiButton.setVisible(true);
		multiButton.addActionListener(this);
		
		minusButton=new JButton("-");
		minusButton.setBounds(350,290,100,70);
		jf.add(minusButton);
		minusButton.setFont(new Font(null, 0,24));
		minusButton.setVisible(true);
		minusButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(350,380,100,70);
		jf.add(addButton);
		addButton.setFont(new Font(null, 0,24));
		addButton.setVisible(true);
		addButton.addActionListener(this);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(20,470,440,60);
		jf.add(clearButton);
		clearButton.setFont(new Font(null, 0,24));
		clearButton.setVisible(true);
		clearButton.addActionListener(this);
		
		
		
		
		
		
		
		jf.add(jl);
		jf.setVisible(true);
		
	}
	
	
public static void main(String[] args) {
	new Calculator();
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==numSeven) {
		if(isOperatorClicked) {
			jl.setText("7");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("7");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti){
					jl.setText("7");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("7");
						isOpratorClickedSub=false;
					}else {
						jl.setText(jl.getText()+"7");
						}
					
		}else if(e.getSource()==numEight) {
			if(isOperatorClicked) {
				jl.setText("8");
				isOperatorClicked=false;
				}else if(isOperatorClickedAdd){
					jl.setText("8");
					isOperatorClickedAdd=false;
					}else if(isOperatorClickedMulti){
						jl.setText("8");
						isOperatorClickedMulti=false;
						}else if(isOpratorClickedSub){
							jl.setText("8");
							isOpratorClickedSub=false;
							}else {
								jl.setText(jl.getText()+"8");
								}
		}else if(e.getSource()==numNine) {
			if(isOperatorClicked) {
				jl.setText("9");
				isOperatorClicked=false;
				}else if(isOperatorClickedAdd){
					jl.setText("9");
					isOperatorClickedAdd=false;
					}else if(isOperatorClickedMulti) {
						jl.setText("9");
						isOperatorClickedMulti=false;
								}else if(isOpratorClickedSub){
									jl.setText("9");
									isOpratorClickedSub=false;
									}else {
										jl.setText(jl.getText()+"9");
									}
			
	}else if(e.getSource()==numFour) {
		if(isOperatorClicked) {
			jl.setText("4");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("4");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText("4");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("4");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"4");
						}
	}else if(e.getSource()==numFive) {
		if(isOperatorClicked) {
			jl.setText("5");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("5");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText("5");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("5");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"5");
						}
	}else if(e.getSource()==numSix) {
		if(isOperatorClicked) {
			jl.setText("6");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("6");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText("6");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("6");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"6");
						}
	}else if(e.getSource()==numOne) {
		if(isOperatorClicked) {
			jl.setText("1");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("1");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText("1");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("1");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"1");
						}
	}else if(e.getSource()==numTwo) {
		if(isOperatorClicked) {
			jl.setText("2");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("2");
				isOperatorClickedAdd=false;	
				}else if(isOperatorClickedMulti) {
					jl.setText("2");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("2");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"2");
						}
	}else if(e.getSource()==numThree) {
		if(isOperatorClicked) {
			jl.setText("3");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("3");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText("3");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("3");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"3");
						}
	}else if(e.getSource()==numDot) {
		if(isOperatorClicked) {
			jl.setText(".");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText(".");
				isOperatorClickedAdd=false;
				}else if(isOperatorClickedMulti) {
					jl.setText(".");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText(".");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+".");
						}
	}else if(e.getSource()==numZero) {
		if(isOperatorClicked) {
			jl.setText("0");
			isOperatorClicked=false;
			}else if(isOperatorClickedAdd){
				jl.setText("0");
				isOperatorClickedAdd=false;
				} else if(isOperatorClickedMulti) {
					jl.setText("0");
					isOperatorClickedMulti=false;
					}else if(isOpratorClickedSub){
						jl.setText("0");
						isOpratorClickedSub=false;
						}else {
							jl.setText(jl.getText()+"0");
						}
		
		}else if(e.getSource()==Equal) {
			isOperatorClickedMulti=true;
			isOperatorClicked=true;
			isOperatorClickedAdd=true;
			isOpratorClickedSub=true;
				newValue=jl.getText();
				float newValueF=Float.parseFloat(newValue);
				float oldValueF=Float.parseFloat(oldValue);
				float ResultM=oldValueF*newValueF;
				isOperatorClickedMulti=false;
				float Result=oldValueF/newValueF;
				isOperatorClicked=false;
				float ResultA=oldValueF+newValueF;
				isOperatorClickedAdd=false;
				float ResultS=oldValueF-newValueF;
				isOpratorClickedSub=false;
				jl.setText(ResultM+"");
				jl.setText(Result+"");
				jl.setText(ResultA+"");
				jl.setText(ResultS+"");
				
			}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			oldValue=jl.getText();
			}else if(e.getSource()==addButton) {
				isOperatorClickedAdd=true;
				oldValue=jl.getText();
				}else if(e.getSource()==multiButton) {
					isOperatorClickedMulti=true;
					oldValue=jl.getText();
					}else if(e.getSource()==minusButton) {
						isOpratorClickedSub=true;
						oldValue=jl.getText();
						}else if(e.getSource()==clearButton) {
							jl.setText("");
							}
	}
}
