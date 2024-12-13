package chapter14;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K_Practice {
    public static void main(String[] args) {

        List<String> fileNames = Arrays.asList(
                "document.pdf", "image1.png", "video.mp4"
                , "presentation.ppt", "image2.png", "image3.jpg"
                , "image4.png", "javascript.js"
        );

        //1. 특정 확장자(.png, .jpg) 필터링
        //List<String>
        List<String> fileFilter = fileNames.stream()
                .filter(name -> name.endsWith("png") || name.endsWith("jpg"))
                .collect(Collectors.toList());
        System.out.println("이미지 파일 필터링 : " + fileFilter); //이미지 파일 필터링 : [image1.png, image2.png, image3.jpg, image4.png]


        //2. 파일 이름을 알파벳 순으로 정렬
        List<String> filesort = fileNames.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("정렬된 파일 : " + filesort); //정렬된 파일 : [document.pdf, image1.png, image2.png, image3.jpg,
        // image4.png, javascript.js, presentation.ppt, video.mp4]
    }
}
