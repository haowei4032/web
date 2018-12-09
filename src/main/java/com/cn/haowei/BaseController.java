package com.cn.haowei;

import java.util.Map;

@SuppressWarnings("unused")
public abstract class BaseController {

    protected Response end(int error, String message) {
        return new Response()
                .setError(error)
                .setMessage(message);
    }

    protected Response end(int error, String message, Map result) {
        return new ResponseForResult()
                .setError(error)
                .setMessage(message)
                .setResult(result);
    }

    protected class Response {

        private int error;
        private String message;


        protected Response setError(int error) {
            this.error = error;
            return this;
        }

        protected Response setMessage(String message) {
            this.message = message;
            return this;
        }

        public int getError() {
            return error;
        }

        public String getMessage() {
            return message;
        }

    }

    protected class ResponseForResult extends Response {

        private Map result;

        private int error;
        private String message;

        protected ResponseForResult setError(int error) {
            this.error = error;
            return this;
        }

        protected ResponseForResult setMessage(String message) {
            this.message = message;
            return this;
        }

        public int getError() {
            return error;
        }

        public String getMessage() {
            return message;
        }

        public ResponseForResult setResult(Map result) {
            this.result = result;
            return this;
        }

        public Map getResult() {
            return result;
        }
    }
}
