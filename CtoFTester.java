public class CtoFTester
        {
            public double CeltoFar(double cel)
            {
                return 1.4 * cel + 32;
            }
            public double FartoCel(double far)
            {
                return ((far - 32) * 5) / 9;
            }
        }