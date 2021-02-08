package Secondjavafx;

public class ExpenseTable {
		String first;
		String sec;
		String date;
		ExpenseTable(){}
		ExpenseTable(String first,String sec,String date){
			this.first= first;
			this.sec= sec;
			this.date= date;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getSec() {
			return sec;
		}
		public void setSec(String sec) {
			this.sec = sec;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
}
