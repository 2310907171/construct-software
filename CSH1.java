	package mission1;

	import java.util.LinkedHashSet;
	import java.util.Set;

	public class CSH1 {
		static int random1;static int random2;		                              //��¼���ɵ��������
		static char sign;				                                          //��¼��ʽ����
		static Set<String> set = new LinkedHashSet();		                      //��¼���ظ���ʽ  LinkedHashSet����˳��
		static int []answer = new int[51];		                                  //��¼������Ŀ������
		public void FormulaSet() {	                                              //������Ŀ����¼
			for(;set.size()<50;) {
				int i = set.size();			                                      //��¼������Ŀ����
				do {
					random1 = (int)(Math.random()*100);
					random2 = (int)(Math.random()*100);
					}while((random1 + random2 > 100) || (random1 - random2 < 0)); //�����������𰸵�ֵ���Ͳ�����100����ֵ��С��0
				if((int)(Math.random()*100)%2 == 0) {		                      //���ƼӼ�����
					sign = '+';
					set.add(random1+"+"+random2);
					answer[i] = random1 + random2;
				}
				else {
					sign = '-';
					set.add(random1 + "-" + random2);
					answer[i] = random1 - random2;
				}
				
			}
		}
		
		
		public void OutputFormula() {		                                      //�����Ŀ����
			int i = 0;
			for(Object object:set) {                                              //ѭ�������Ŀ
				i++;           
				System.out.print(object + "=" + "\t\t");
				if(i%10 == 0) {                                                   //���ƻ���
					System.out.println();
				}
			}
		}
		
		
		public void Outputanswer() {			                                  //������
			for(int i = 0;i < 50; i++ ) {                                         
				System.out.print("��" + (i + 1) + "����𰸣�" + answer[i]);
				System.out.print("\t");                                           //����Ŀ�����ʽ��Ӧ
				if((i+1) % 10 == 0) {                                             //���ƻ���
					System.out.println();
				}
			}
		}
		
		
		
		
		public static void main(String[] args) {                                  //������
			CSH1 ran = new CSH1();
			ran.FormulaSet();                                                     //������Ŀ����
			ran.OutputFormula();                                                  //�����Ŀ����
			System.out.println("�𰸣�");
			ran.Outputanswer();                                                   //����𰸺���
			
		}
}
