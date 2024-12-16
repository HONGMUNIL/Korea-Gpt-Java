package chapter16.practice;


//chapter 13 - practice (도서 관리 시스템에 Enum 자료형 사용 추가)


import chapter16.practice.entity.Category;
import chapter16.practice.entity.Item;
import chapter16.practice.service.LibraryManager;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("======Library System ===========");
            System.out.println("1. Search By Category");

            System.out.println("Select an option :");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                //parseInt(String s) 문자열을 int로 변환
                switch (choice){
                    case 1:
                        System.out.print(" Enter Category:");
                        String searchCategory = scanner.nextLine();
                        try {
                          Category searchCategoryEnum = Category.fromString(searchCategory);
                          List<Item> categoryResults = manager.seachByCategory(searchCategoryEnum);
                          if(categoryResults.isEmpty()){
                              System.out.println("No items fount in category :" + searchCategoryEnum);
                          }else {
                              categoryResults.forEach(Item::display);
                          }
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            }catch (NumberFormatException e){
                //sout : 기본 출력 담당
                //serr: 인자 내의 문자열을 오류로 인식하고 출력 빨간줄로 만듬
                System.err.println("Please enter a valid number ");


            }catch (NoSuchElementException e){
                System.err.println(e.getMessage());
            }


        }

    }
}
