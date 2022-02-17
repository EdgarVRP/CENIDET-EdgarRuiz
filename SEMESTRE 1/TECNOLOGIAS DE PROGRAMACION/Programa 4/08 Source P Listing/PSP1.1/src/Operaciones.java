public class Operaciones {
	public double Correlacion (double DBX[],double DBY[]) {
		double TDBX[]=DBX,TDBY[]=DBY;
		double SUMX=0, SUMY=0, SUMXX=0,SUMYY=0,SUMXY=0;
		double Corr=0;
		for(int M=0;M<TDBX.length; M++) {
			SUMX=TDBX[M]+SUMX;
		}
		for(int M=0;M<TDBY.length; M++) {
			SUMY=TDBY[M]+SUMY;
		}
		for(int M=0;M<TDBX.length; M++) {
			SUMXX=(TDBX[M]*TDBX[M])+SUMXX;
		}
		for(int M=0;M<TDBY.length; M++) {
			SUMXY=(TDBX[M]*TDBY[M])+SUMXY;
		}
		for(int M=0;M<TDBY.length; M++) {
			SUMYY=(TDBY[M]*TDBY[M])+SUMYY;
		}
		int n=TDBY.length;
		double sum1=(n*SUMYY)-(SUMY*SUMY);
		double sum2=(n*SUMXX)-(SUMX*SUMX);
		double sum3=Math.sqrt(sum1*sum2);
		Corr=((n*SUMXY)-(SUMX*SUMY))/sum3;
		return Corr;
	}
}
