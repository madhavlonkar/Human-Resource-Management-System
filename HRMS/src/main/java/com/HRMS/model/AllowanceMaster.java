package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AllowanceMaster")
public class AllowanceMaster {

		@Id
		@Column(name="allowance_id")
		private int allowance_id;
		
		@Column(name="allowance_name")
		private String allowance_name;
		
		@Column(name="allowance_decription")
		private String allowance_description;

		public int getAllowance_id() {
			return allowance_id;
		}

		public void setAllowance_id(int allowance_id) {
			this.allowance_id = allowance_id;
		}

		public String getAllowance_name() {
			return allowance_name;
		}

		public void setAllowance_name(String allowance_name) {
			this.allowance_name = allowance_name;
		}

		public String getAllowance_description() {
			return allowance_description;
		}

		public void setAllowance_description(String allowance_description) {
			this.allowance_description = allowance_description;
		}

		public AllowanceMaster(int allowance_id, String allowance_name, String allowance_description) {
			super();
			this.allowance_id = allowance_id;
			this.allowance_name = allowance_name;
			this.allowance_description = allowance_description;
		}

		public AllowanceMaster() {
			super();
		}
		
		public AllowanceMaster(int allowance_id) {
			super();
			this.allowance_id=allowance_id;
		}
		

		@Override
		public String toString() {
			return "AllowanceMaster [allowance_id=" + allowance_id + ", allowance_name=" + allowance_name
					+ ", allowance_description=" + allowance_description + "]";
		}
		
		

}
