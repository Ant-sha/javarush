package com.javarush.task.task25.task2503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        /*List<Column> result = new LinkedList<>();
        Column[]columns=Column.values();
        for (Column column:columns) {
            if (column.isShown()){
                result.add(if(realOrder[i],column);
            }
        }*/
        /*
        В методе   getVisibleColomns, попробуй не создавать сразу весь список заполненный null'ами,
        а постепенно заполнять (функцией add) его в соответствии со значением в realOrder[i]
        (при условии что значение  меньше размера результирующего списка, иначе добавляй на позицию 0).
         И все это при условии что значение не равно -1.

        return result;*/

            List<Column> result = new ArrayList<>();
            System.out.println(Arrays.toString(Column.values()));
            System.out.println(Arrays.toString(realOrder));
            //List<Integer> beforeResult = new ArrayList<>();
            for (int i = 0; i < realOrder.length; i++) {
                if (realOrder[i] != -1) {
                    result.add(null);
                }
            }
            for (int i =0; i < realOrder.length; i++) {
                if (realOrder[i] != -1) {
                    result.set(realOrder[i], Column.values()[i]);
                }
            }
        /*for (Column col: result) {
            System.out.println("result: " + col);
        }*/
            return result;
    }


    @Override
    public String getColumnName() {
        switch (this){
            case AccountNumber:
                return Column.AccountNumber.columnName;
            case Customer:
                return Column.Customer.columnName;
            case Amount:
                return Column.Amount.columnName;
            case BankName:
                return Column.BankName.columnName;
        }
        return null;

    }

    @Override
    public boolean isShown() {
        return realOrder[this.ordinal()] != -1;
    }

    @Override
    public void hide() {
        int index = realOrder[ordinal()];
        realOrder[ordinal()] = -1;
        for(int i=0;i<realOrder.length;i++){
            if(realOrder[i]>=index)
                realOrder[i]--;
        }

    }
}
