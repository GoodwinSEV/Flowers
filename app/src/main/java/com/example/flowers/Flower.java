package com.example.flowers;

public class Flower {
    public class ArrayValue{
        private String category;
        private int price;
        private String instructions;
        private String photo;
        private String name;
        private int productId;

        public String getCategory(){
            return category;
        }
        public void setCategory(String input){
            this.category = input;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int input){
            this.price = input;
        }
        public String getInstructions(){
            return instructions;
        }
        public void setInstructions(String input){
            this.instructions = input;
        }
        public String getPhoto(){
            return photo;
        }
        public void setPhoto(String input){
            this.photo = input;
        }
        public String getName(){
            return name;
        }
        public void setName(String input){
            this.name = input;
        }
        public int getProductId(){
            return productId;
        }
        public void setProductId(int input){
            this.productId = input;
        }
    }

}
