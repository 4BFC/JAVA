class OperatorEx14 { 
      public static void main(String[] args) { 
            char c = 'a'; 
            for(int i=0; i<26; i++) {          // ��{} ���� ������ 26���� �ݺ��Ѵ�. 
                        System.out.print(c++); 
                        //1a,2b,3c,4d,5e/,1f,2g,3h,4i,5j/,1k,2l,3m,4n,5o/,1p,2q,3r,4s,5t/,1u,2v,3w,4x,5y/,6z
            } 
            
            System.out.println(); // �ٹٲ��� �Ѵ�.

            c = 'A'; 
            for(int i=0; i<26; i++) {          // ��{} ���� ������ 26���� �ݺ��Ѵ�. 
                        System.out.print(c++); //'A'���� 26���� ���ڸ� ����Ѵ�. 
            } 

            System.out.println(); 

            c='0'; 
            for(int i=0; i<10; i++) {          // ��{} ���� ������ 10���� �ݺ��Ѵ�. 
                        System.out.print(c++); //'0'���� 10���� ���ڸ� ����Ѵ�. 
            } 
            System.out.println(); 
      } 
} 
