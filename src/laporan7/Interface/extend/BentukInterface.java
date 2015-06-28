package laporan7.Interface.extend;

import laporan7.Interface.BentukKeliling;
import laporan7.Interface.BentukLuas;


public interface BentukInterface extends BentukKeliling, BentukLuas{
	public static final double PHI=3.14;
	public void tulis();
}