/*
 *  Copyright (C) 2010  Yuri Kanivets
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package kankan.wheel.demo;

import kankan.wheel.R;
import kankan.wheel.widget.NumericWheelAdapter;
import kankan.wheel.widget.WheelView;
import android.app.Activity;
import android.os.Bundle;

public class PasswActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.passw_layout);
        initWheel(R.id.passw_1);
        initWheel(R.id.passw_2);
        initWheel(R.id.passw_3);
        initWheel(R.id.passw_4);
    }
    
    /**
     * Initializes wheel
     * @param id the wheel widget id
     */
    private void initWheel(int id) {
        WheelView wheel = (WheelView) findViewById(id);
        wheel.setAdapter(new NumericWheelAdapter(0, 9));
        wheel.setCurrentItem((int)(Math.random() * 10));
    }
}