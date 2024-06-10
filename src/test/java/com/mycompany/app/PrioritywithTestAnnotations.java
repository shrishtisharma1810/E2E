package com.mycompany.app;

import org.testng.annotations.Test;

public class PrioritywithTestAnnotations {
	@Test(priority=-2)
	  public void b() {
		  System.out.println("Test b");
	  }
	  @Test(priority=3)
	  public void a() {
		  System.out.println("Test a");
	  }
	  @Test(priority=-5)
	  public void f() {
		  System.out.println("Test f");
	  }
	  @Test
	  public void k() {
		  System.out.println("Test k");
	  }
}
/* with priority execution f(priority -5 highest), b(priority -2 next highest),k(priority 0 default) and a(priority 3)
 *[RemoteTestNG] detected TestNG version 7.4.0
Test f 
Test b
Test k
Test a
 */
	  /*
  @Test
  public void b() {
	  System.out.println("Test b");
  }
  @Test
  public void a() {
	  System.out.println("Test a");
  }
  @Test
  public void f() {
	  System.out.println("Test f");
  }
  @Test
  public void k() {
	  System.out.println("Test k");
  }
  }
  /* without priority test cases are executed alphabetically
   *[RemoteTestNG] detected TestNG version 7.4.0
	Test a
	Test b
	Test f
	Test k
   */

