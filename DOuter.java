 class DOuter {
		private int i;
		private void m1(){
			System.out.println("m1()");
		}
		class DInner	{
			int j;
			void m2(){			System.out.println("m2()");		}
			class DInnerInner		{
				void use(){	System.out.println("i : " + i);
					m1();
					System.out.println("j : " + j);
					m2();
				}
			}
		}

		static class DInner2	{
			int k;
			void m3(){
				System.out.println("m3()");
				}
			}
			static interface DInner3
			{
			}
		}
		interface OutInter
		{
			static interface InInter
			{
			}
		}
		class D 
		{
			public static void main(String[] args) 
			{
				DOuter out = new DOuter();
				DOuter.DInner in = out.new DInner();
				DOuter.DInner.DInnerInner inin = in.new DInnerInner();
				inin.use();
			}
		}
