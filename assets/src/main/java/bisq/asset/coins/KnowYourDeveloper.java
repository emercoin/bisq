/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.Base58BitcoinAddressValidator;
import bisq.asset.Coin;
import bisq.asset.NetworkParametersAdapter;

public class KnowYourDeveloper extends Coin {
    public KnowYourDeveloper() {
        super("Know Your Developer", "KYD", new Base58BitcoinAddressValidator(new KydMainNetParams()));
    }

    public static class KydMainNetParams extends NetworkParametersAdapter {
        public KydMainNetParams() {
            this.addressHeader = 78;
            this.p2shHeader = 85;
            this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};
        }
    }
}
