/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author User
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String packSize;
    private Double price;
    private int qty;

    public ItemDto(String itemCode, String description, String packSize, Double price, int qty) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.price = price;
        this.qty = qty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getDescription() {
        return description;
    }

    public String getPackSize() {
        return packSize;
    }

    public Double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", price=" + price + ", qty=" + qty + '}';
    }
}
