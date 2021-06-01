package com.company;

public class Passenger {
    private  static int idCounter=1;
    private Address address;
    private Contact contact;

    public Passenger(Address address,Contact contact) {
        this.address=address;
        this.contact=contact;
    }



    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return this.phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactDetails() {
            return "Name  : " + this.name + " Phone   : " + this.phone + " EmailID   : " + this.email;
        }

        public void updateContactDetails(String contactDetail) {
        }
    }

    private static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return this.street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return this.state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getAddressDetails() {
            return "Street : " + this.street + " City  : " + this.city + " State  : " + this.state;
        }

        public void updateAddressDetails(String addressDetail) {
        }
        public void getPassengerCount(){
            System.out.println(Passenger.idCounter++);
        }
    }
}

