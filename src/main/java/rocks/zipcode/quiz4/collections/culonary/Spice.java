package rocks.zipcode.quiz4.collections.culonary;

import sun.security.provider.ConfigFile;

/**
 * @author leon on 27/12/2018.
 */
public abstract class Spice {

    @Override
        public boolean equals(Object obj) {
            return this.getClass().equals(obj.getClass());
        }
}
