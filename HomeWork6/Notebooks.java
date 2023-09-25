public class Notebooks {
        private String brand;
        private String RAM;
        private String HDD;
        private String OS;
        private String color;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getRAM() {
            return RAM;
        }

        public void setRAM(String RAM) {
            this.RAM = RAM;
        }

        public String getHDD() {
            return HDD;
        }

        public void setHDD(String HDD) {
            this.HDD = HDD;
        }

        public String getOS() {
            return OS;
        }

        public void setOS(String OS) {
            this.OS = OS;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        public Notebooks(String brand, String RAM, String HDD, String OS, String color) {

            this.brand = brand;
            this.RAM = RAM;
            this.HDD = HDD;
            this.OS = OS;
            this.color = color;

        }


    @Override
    public String toString() {
        return "Notebooks{" +
                "brand='" + brand + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



