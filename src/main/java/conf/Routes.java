/**
 * Earthdawn Character WebTool -- A web application to create, edit, store and print Earthdawn characters
 * Copyright (C) 2016  Holger von Rhein
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3 as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package conf;

import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.ApplicationController;

public class Routes implements ApplicationRoutes {

	@Override
	public void init(Router router) {
		router.GET().route("/").with(ApplicationController.class, "index");
		router.GET().route("/general").with(ApplicationController.class, "general");
		router.GET().route("/disciplines").with(ApplicationController.class, "disciplines");
		router.GET().route("/attributes").with(ApplicationController.class, "attributes");
		router.GET().route("/knacks").with(ApplicationController.class, "knacks");
		router.GET().route("/skills").with(ApplicationController.class, "skills");
		router.GET().route("/languages").with(ApplicationController.class, "languages");
		router.GET().route("/experience").with(ApplicationController.class, "experience");
		router.GET().route("/karma").with(ApplicationController.class, "karma");
		router.GET().route("/devotionpoints").with(ApplicationController.class, "devotionpoints");
		router.GET().route("/inventory").with(ApplicationController.class, "inventory");

		// Assets (pictures / javascript)
		router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
		router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");

		// Catchall shows index page
		router.GET().route("/.*").with(ApplicationController.class, "index");
	}
}
