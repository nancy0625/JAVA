package com.imooc;


	//�ⲿ��
	public class HelloWorld {
	    
	    private String name = "��Ľ��";
	    
	    // �ⲿ���е�show����
	    public void show() { 
			// ���巽���ڲ���
			class MInner {
				int score = 83;
				public int getScore() {
					return score + 10;
				}
			}
	        
			// ���������ڲ���Ķ���
	        MInner ni = new MInner();
	        
	        // �����ڲ���ķ���
			ni.getScore();
	        
			System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" );
		}
	    
		// ���Է����ڲ���
		public static void main(String[] args) {
	        
			// �����ⲿ��Ķ���
	        HelloWorld mo = new HelloWorld();
	        
	        // �����ⲿ��ķ���
			mo.show();
		}
	}


