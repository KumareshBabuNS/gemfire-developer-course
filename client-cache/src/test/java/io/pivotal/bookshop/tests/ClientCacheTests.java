package io.pivotal.bookshop.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.pivotal.bookshop.domain.Book;
import io.pivotal.bookshop.domain.Customer;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

// TODO-06: Run the test suite
public class ClientCacheTests {

  private ClientCache cache;
  private Region<Long, Book> books;
  private Region<Long, Customer> customers;

  @Before
  public void setUp() throws Exception {
    // TODO-04: Write the code to obtain a reference to a ClientCache instance;
    //  if necessary, use the set() method to configure your client cache factory
    //  before calling create()

    // TODO-05: Make call to the getRegion() method to get the Book and Customer regions
    // from the ClientCache and assign to instance variables

  }

  @Test
  public void regionsShouldExist() {
    assertNotNull(books);
    assertNotNull(customers);
  }

  @Test
  public void customersShouldExist() {
    assertNotNull(customers);

    Customer customer = customers.get(5598L);
    assertNotNull("Customer shouldn't be null", customer);
    assertEquals("Failed to fetch the correct customer object", "Kari", customer.getFirstName());
  }

  @Test
  public void booksShouldExist() {
    assertNotNull(books);

    Book book = books.get(456L);
    assertNotNull("Book shouldn't be null", book);
    assertEquals("Failed to fetch the correct book", "Clifford the Big Red Dog", book.getTitle());
  }

  @Test
  @Ignore
  // TODO-08: Remove @Ignore annotation, re-run tests and this one should pass as well
  // TODO-09: Re-run the tests and verify that both pass
  public void localRegionShouldExist() {
    Region<Long, String> localRegion = cache.getRegion("LocalRegion");
    assertNotNull("Region should not be null", localRegion);
  }

}