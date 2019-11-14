	package mission1;

	import java.util.LinkedHashSet;
	import java.util.Set;

	public class CSH1 {
		static int random1;static int random2;		                              //记录生成的随机数字
		static char sign;				                                          //记录算式符号
		static Set<String> set = new LinkedHashSet();		                      //记录无重复算式  LinkedHashSet插入顺序
		static int []answer = new int[51];		                                  //记录生成题目的数组
		public void FormulaSet() {	                                              //产生题目，记录
			for(;set.size()<50;) {
				int i = set.size();			                                      //记录生成题目个数
				do {
					random1 = (int)(Math.random()*100);
					random2 = (int)(Math.random()*100);
					}while((random1 + random2 > 100) || (random1 - random2 < 0)); //控制条件：答案的值：和不大于100，差值不小于0
				if((int)(Math.random()*100)%2 == 0) {		                      //控制加减符号
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
		
		
		public void OutputFormula() {		                                      //输出题目函数
			int i = 0;
			for(Object object:set) {                                              //循环输出题目
				i++;           
				System.out.print(object + "=" + "\t\t");
				if(i%10 == 0) {                                                   //控制换行
					System.out.println();
				}
			}
		}
		
		
		public void Outputanswer() {			                                  //输出结果
			for(int i = 0;i < 50; i++ ) {                                         
				System.out.print("第" + (i + 1) + "道题答案：" + answer[i]);
				System.out.print("\t");                                           //与题目输出格式对应
				if((i+1) % 10 == 0) {                                             //控制换行
					System.out.println();
				}
			}
		}
		
		
		
		
		public static void main(String[] args) {                                  //主函数
			CSH1 ran = new CSH1();
			ran.FormulaSet();                                                     //生成题目函数
			ran.OutputFormula();                                                  //输出题目函数
			System.out.println("答案：");
			ran.Outputanswer();                                                   //输出答案函数
			
		}
}
