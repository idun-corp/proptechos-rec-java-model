package com.proptechos.model.building;

public class Address {

    private String type;

    private Details address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Details getAddress() {
        return address;
    }

    public void setAddress(Details address) {
        this.address = address;
    }

    public static class Details {

        private String street;

        private String postalCode;

        private String city;

        private String country;

        private String locality;

        private String region;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
