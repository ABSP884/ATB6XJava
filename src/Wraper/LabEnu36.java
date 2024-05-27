package Wraper;

public class LabEnu36 {
    public static void main(String[] args) {
        HTTPSTATUS status = HTTPSTATUS.OK;
        System.out.println("code is " + status.getCode()+" Message is " + status.getMessage() );

    }
    enum HTTPSTATUS{

       OK(201,"ok"),
        CREATED(202,"Created"),
        ACCEPTED(204,"Accepted");
        private int code;
        private String message;

        HTTPSTATUS(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
