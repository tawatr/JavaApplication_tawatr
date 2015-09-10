import java.io.File;

class App {
    
    double f( double x){
        return 2*x;
    }
    
    double tax( double price){
        return price*7/100;
    }
    
    double areaOfCircle( double radius ){
        return Math.PI*Math.pow(radius,2.0);
    }
    
    // Sum of odd number between [1,n]
    int sumOdd( int n){
        int ii=1;
        int sum=0;
        while(ii<=n){
            if(ii%2!=0){
                sum=sum+ii;
            }
            ii=ii+1;  
        }
        return sum;
    }
    
    int total( double [] a){
        int ii=0;
        int sum=0;
        while(ii<a.length){
            sum=sum+ii;
            ii=ii+1;  
        }
        return sum;
    }
    
    int [] divider(int n1){
        int ii=0;
        int ic=0;
        int [] x1 = new int[10];
        
        while(ii<n1){
            ii=ii+1;
            if(n1%ii==0){
                x1[ic]=ii;
                ic=ic+1;
            }
        }
        System.out.format( " The dividers of %d are:", n1 );
        ii=0;
        while(ii<ic){
        System.out.format( " %d", x1[ii] );
            ii=ii+1;
        }
        System.out.format( "\n" );

        return x1;
    }
    
    double average (double [] a){
        App app1 = new App();
        return app1.total(a)/a.length;
    }
    // ให้เขียน method หาชื่อไฟล์ที่ต้องการใน folder ไม่จำเป็นต้องหาใน subfolder
    boolean search(String fileName, String folderName) {
	String [] list1 = new java.io.File(folderName).list();
        String filename_full ;
        File file1;
//        File filename1=
        filename_full=folderName+"/"+fileName;
        file1=new File(filename_full);
        System.out.println( filename_full );
        if( file1.exists() ){
            System.out.format( "The file:" + " %s " + " exist\n", filename_full );
        } else{
            System.out.format( "The file:" + " %s " + " does not exist\n", filename_full );
        }
        
        return file1.exists();
    }
    /* 
    
    */
    public static void main( String [] args ){
            // [] for array
        App a = new App();
        double [] result1 = new double[10];
        int ii = 1;
        int n_div = 15;
        
        ii=1;
        while(ii<10){
            result1[ii] = a.areaOfCircle( ii );
            ii=ii+1;
        }
        
        System.out.println( "Test search:");
        a.search( "java.log.5860", "/Users/tawatr");
         
        System.out.println( "The average:");
        System.out.println( a.average( result1 ) );
        
        a.divider( n_div );
        

        System.out.println( a.total( result1 ) );
        System.out.println( a.sumOdd( 5 ) );
        System.out.println( a.tax( 100.0 ) );
        System.out.println( a.areaOfCircle( 4.0 ) );
        
        while (ii<=10) {
//            System.out.println(ii);
            if (ii%2==0){
                System.out.println(ii);
            }
            ii=ii+1;
        }
        
        //System.out.println( "Hello World! ");
        //System.out.println( a.f(5) );
        
    }
}