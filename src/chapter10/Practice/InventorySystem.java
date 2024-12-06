package chapter10.Practice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class InventorySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========Inventory System=========");
            System.out.println("1. Add Book");
            System.out.println("2. List All Book");
            System.out.println("3. Search Book");
            System.out.println("4. Search by Category");
            System.out.println("5. Search by Price Range");
            System.out.println("6. Update Stock");
            System.out.println("7. Remove Book");
            System.out.println("8. Exit");
            System.out.println("Select an option : ");

            try {
                // scanner.nextLine();
                // :입력값이 문자열로 인식

                //Integer.parseInt(데이터)
                // : 데이터를 분석하여 Integer 형태로 변경
                // >> 숫자 형태로 변경할 수 없는 값이 입력되는 경우 NumberFormatExcepton 예외 발생
                //EX) "안녕" 이런거

                //cf) parse: 분석하다
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter  Book ID :");
                        String id = scanner.nextLine();
                        System.out.println("Enter  Book title :");
                        String title = scanner.nextLine();
                        System.out.println("Enter  Book ISBN :");
                        String isbn = scanner.nextLine();
                        System.out.println("Enter  Book Author :");
                        String author = scanner.nextLine();
                        System.out.println("Enter  Book Publisher :");
                        String publisher = scanner.nextLine();

                        System.out.println("Enter  Book PublishYear :");
                        int year = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter  Price :");
                        int price = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter  Stock Quantity :");
                        int stock = Integer.parseInt(scanner.nextLine());

                        System.out.println("Enter  Book Category :");
                        String category = scanner.nextLine();

                        manager.add(new Book(id, title, isbn, author, publisher, year, price, stock, category));
                        //new Book() 요부분 업캐스팅이라함

                        break;


                    case 2:
                        manager.listAll();
                        break;


                    case 3:
                        System.out.println("Enter search keyword");
                        String keyword = scanner.nextLine();
                        List<Item> searchResults = manager.search(keyword);
                        if (searchResults.isEmpty()) {
                            System.out.println(" No items found in keyword:" + searchResults);

                        } else {
                            for (Item item : searchResults) {
                                item.display();
                            }
                        }
                        break;


                    case 4:
                        System.out.println("Enter category");
                        String searchCategory = scanner.nextLine();
                        List<Item> categoryResults = manager.searchByCategory(searchCategory);
                        if (categoryResults.isEmpty()) {
                            System.out.println(" No items found in category:" + searchCategory);
                        } else {
                            for (Item item : categoryResults) {
                                item.display();
                            }
                        }
                        break;


                    case 5:
                        System.out.println("Enter minimum price :");
                        int minPrice = Integer.parseInt(scanner.nextLine());
                        int maxPrice = Integer.parseInt(scanner.nextLine());

                        List<Item> priceResults = manager.searchByPriceRange(minPrice, maxPrice);
                        if(priceResults.isEmpty()){
                            System.out.println(" No items found in price range");
                        }else{
                     //       for(Item item : priceResults){
                      //          item.display();
                    //        }

                            priceResults.forEach(Item::display);
                        }
                        break;

                    case 6:
                        System.out.println("Enter Book ID to update stock:");
                        String updateId = scanner.nextLine();
                        System.out.println("Enter quantity to add/subtract");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        manager.updateStock(updateId, quantity);
                        break;

                    case 7 :
                        System.out.println("Enter Book ID to remove");
                        String removeId = scanner.nextLine();
                        manager.remove(removeId);
                        break;

                    case 8 :
                        System.out.println(" ====Exiting===");
                        return;
                    default:
                        System.out.println("Invalid option. Try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Enter a valid Number :");
            }catch (NoSuchElementException e){
                //검색된 내용이 없을 경우 실행될 블럭
                System.out.println(e.getMessage());
            }catch (Exception e ){
                System.out.println(e.getMessage());
            }
        }


    }
}
