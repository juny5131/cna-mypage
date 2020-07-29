package local;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long orderid;
        private Long productid;
        private Integer qty;
        private Long deliveryid;
        private String status;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getOrderid() {
            return orderid;
        }

        public void setOrderid(Long orderid) {
            this.orderid = orderid;
        }
        public Long getProductid() {
            return productid;
        }

        public void setProductid(Long productid) {
            this.productid = productid;
        }
        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }
        public Long getDeliveryid() {
            return deliveryid;
        }

        public void setDeliveryid(Long deliveryid) {
            this.deliveryid = deliveryid;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

}
