package rocks.zipcode.quiz4.collections.culonary;

import sun.security.provider.ConfigFile;

/**
 * @author leon on 27/12/2018.
 */
public interface Spice {
    Spice spice = new Spice() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };


}
