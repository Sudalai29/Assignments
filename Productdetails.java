package scratch;

public class Productdetails {
  
  public static void main(String[] args) {
      Products[] prod = new Products[6];
      
      for(int i = 1 ; i < 6 ; i ++)
      {
        prod[i] = new Products();
      }
       
      prod[1].setProdId("1");
      prod[1].setProdName("Chair");
      prod[1].setProdPrice(200);
      prod[1].setProdDesc("useful to sit");
      
      prod[2].setProdId("2");
      prod[2].setProdName("computer");
      prod[2].setProdPrice(40000);
      prod[2].setProdDesc("used to study & work");
      
      prod[3].setProdId("3");
      prod[3].setProdName("books");
      prod[3].setProdPrice(500);
      prod[3].setProdDesc("used to learn");
      
      prod[4].setProdId("4");
      prod[4].setProdName("Computer mouse");
      prod[4].setProdPrice(600);
      prod[4].setProdDesc("used to operate PC");
      
      prod[5].setProdId("5");
      prod[5].setProdName("pen");
      prod[5].setProdPrice(50);
      prod[5].setProdDesc("used to write");
      
      
      for(int i = 1 ; i < 6 ; i ++)
      {
        for(int j = i ; j < 6 ; j ++)
        {
          double x = prod[i].getProdPrice();
          double y = prod[j].getProdPrice();
          if(x < y)
          {
            Products temp;
            temp =  prod[i];
            prod[i] = prod[j];
            prod[j] = temp;
          }      
        }
      }
      
      for(int i = 1 ; i < 6 ; i ++)
      {
    	System.out.println("the costliest product is: "); 
        System.out.println("product id: "+prod[i].getProdId());
        System.out.println("name is: "+prod[i].getProdName());
        System.out.println("price is: "+prod[i].getProdPrice());
        System.out.println("description: "+prod[i].getProdDesc());
      }
 
  }
}