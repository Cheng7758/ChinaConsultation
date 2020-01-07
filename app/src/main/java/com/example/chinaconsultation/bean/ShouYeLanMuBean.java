package com.example.chinaconsultation.bean;

import java.util.List;

/**
 * Created by 爸爸 on 2020/1/5.
 */

public class ShouYeLanMuBean {

    /**
     * status : 200
     * msg : ok
     * data : [{"id":0,"title":"热门"},{"id":4,"title":"制度必读","type":1},{"id":5,"title":"制度治理","type":1},{"id":6,"title":"制度创新","type":1},{"id":7,"title":"制度讲座","type":1}]
     */

    private int status;
    private String msg;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 0
         * title : 热门
         * type : 1
         */

        private int id;
        private String title;
        private int type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
