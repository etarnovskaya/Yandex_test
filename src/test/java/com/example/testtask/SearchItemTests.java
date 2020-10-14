package com.example.testtask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase{

    @Test
    public void testItem() {
        goToMarket();

        switchToNextTab();
        selectComputersDepartment();
        flterItem(new Item("planshety", "20000", "35000", "Apple"));
//        WebElement item = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
//        String itemName = item.findElement(By.xpath(".//h3")).getText();
        String itemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();

        System.out.println(itemName);




        /*
        Перейти на Яндекс Маркет
4. Выбрать раздел Компьютеры
5. Выбрать раздел Планшеты
6. Зайти в расширенный поиск
7. Задать параметр поиска от 20000 до 35000 рублей.
8. Выбрать производителя “Apple”
9. Применить условия поиска
10. Запомнить второй элемент в результатах поиска
11. В поисковую строку ввести запомненное значение.
12. Найти и проверить, что наименование товара соответствует запомненному
значению.
        * */
    }

}
