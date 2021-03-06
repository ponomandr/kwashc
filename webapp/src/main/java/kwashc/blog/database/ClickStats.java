/*
 * Copyright 2012 Kantega AS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kwashc.blog.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * We save some statistics on external links, done from {@link kwashc.blog.servlet.RedirectServlet}
 */
public class ClickStats {

    private static final Map<String, Integer> clicks = Collections.synchronizedMap(new HashMap<String, Integer>());

    public static void addClick(String url) {
        int count = 0;
        if (clicks.containsKey(url)) {
            count = clicks.get(url);
        }
        clicks.put(url, count + 1);
    }
}
