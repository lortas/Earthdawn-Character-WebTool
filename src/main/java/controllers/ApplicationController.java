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
package controllers;

import ninja.Result;
import ninja.Results;
import ninja.session.Session;

import com.google.inject.Singleton;

@Singleton
public class ApplicationController {
	public Result index(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageHome", "" );
		return result;
	}

	public Result general(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageGeneral", "" );
		return result;
	}

	public Result disciplines(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageDisciplines", "" );
		return result;
	}

	public Result attributes(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageAttributes", "" );
		return result;
	}

	public Result knacks(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageKnacks", "" );
		return result;
	}

	public Result skills(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageSkills", "" );
		return result;
	}

	public Result languages(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageLanguages", "" );
		return result;
	}

	public Result experience(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageExperience", "" );
		return result;
	}

	public Result karma(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageKarma", "" );
		return result;
	}

	public Result devotionpoints(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageDevotionpoints", "" );
		return result;
	}

	public Result inventory(Session session) {
		System.err.println(session.getId());
		Result result = Results.html();
		result.render( "pageInventory", "" );
		return result;
	}
}
