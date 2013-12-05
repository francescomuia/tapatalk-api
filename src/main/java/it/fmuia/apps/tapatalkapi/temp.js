function isMobileOut() {
	if (navigator.userAgent.toLowerCase().indexOf("android") > -1
			|| navigator.userAgent.toLowerCase().indexOf("blackberry9500") > -1
			|| navigator.userAgent.toLowerCase().indexOf("blackberry9530") > -1
			|| navigator.userAgent.toLowerCase().indexOf("cupcake") > -1
			|| navigator.userAgent.toLowerCase().indexOf("dream") > -1
			|| navigator.userAgent.toLowerCase().indexOf("incognito") > -1
			|| navigator.userAgent.toLowerCase().indexOf("iphone") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ipod") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ipad") > -1
			|| navigator.userAgent.toLowerCase().indexOf("mini") > -1
			|| navigator.userAgent.toLowerCase().indexOf("webos") > -1
			|| navigator.userAgent.toLowerCase().indexOf("webmate") > -1
			|| navigator.userAgent.toLowerCase().indexOf("2.0 mmp") > -1
			|| navigator.userAgent.toLowerCase().indexOf("240×320") > -1
			|| navigator.userAgent.toLowerCase().indexOf("asus") > -1
			|| navigator.userAgent.toLowerCase().indexOf("au-mic") > -1
			|| navigator.userAgent.toLowerCase().indexOf("alcatel") > -1
			|| navigator.userAgent.toLowerCase().indexOf("amoi") > -1
			|| navigator.userAgent.toLowerCase().indexOf("audiovox") > -1
			|| navigator.userAgent.toLowerCase().indexOf("avantgo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("benq") > -1
			|| navigator.userAgent.toLowerCase().indexOf("bird") > -1
			|| navigator.userAgent.toLowerCase().indexOf("blackberry") > -1
			|| navigator.userAgent.toLowerCase().indexOf("blazer") > -1
			|| navigator.userAgent.toLowerCase().indexOf("cdm") > -1
			|| navigator.userAgent.toLowerCase().indexOf("cellphone") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ddipocket") > -1
			|| navigator.userAgent.toLowerCase().indexOf("danger") > -1
			|| navigator.userAgent.toLowerCase().indexOf("docomo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("elaine/3.0") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ericsson") > -1
			|| navigator.userAgent.toLowerCase().indexOf("eudoraweb") > -1
			|| navigator.userAgent.toLowerCase().indexOf("fly") > -1
			|| navigator.userAgent.toLowerCase().indexOf("hp.ipaq") > -1
			|| navigator.userAgent.toLowerCase().indexOf("haier") > -1
			|| navigator.userAgent.toLowerCase().indexOf("huawei") > -1
			|| navigator.userAgent.toLowerCase().indexOf("iemobile") > -1
			|| navigator.userAgent.toLowerCase().indexOf("j-phone") > -1
			|| navigator.userAgent.toLowerCase().indexOf("kddi") > -1
			|| navigator.userAgent.toLowerCase().indexOf("konka") > -1
			|| navigator.userAgent.toLowerCase().indexOf("kwc") > -1
			|| navigator.userAgent.toLowerCase().indexOf("kyocera/wx310k") > -1
			|| navigator.userAgent.toLowerCase().indexOf("lg") > -1
			|| navigator.userAgent.toLowerCase().indexOf("lg/u990") > -1
			|| navigator.userAgent.toLowerCase().indexOf("lenovo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("midp-2.0") > -1
			|| navigator.userAgent.toLowerCase().indexOf("mmef20") > -1
			|| navigator.userAgent.toLowerCase().indexOf("mot-v") > -1
			|| navigator.userAgent.toLowerCase().indexOf("mobilephone") > -1
			|| navigator.userAgent.toLowerCase().indexOf("motorola") > -1
			|| navigator.userAgent.toLowerCase().indexOf("newgen") > -1
			|| navigator.userAgent.toLowerCase().indexOf("netfront") > -1
			|| navigator.userAgent.toLowerCase().indexOf("newt") > -1
			|| navigator.userAgent.toLowerCase().indexOf("nintendo wii") > -1
			|| navigator.userAgent.toLowerCase().indexOf("nitro") > -1
			|| navigator.userAgent.toLowerCase().indexOf("nokia") > -1
			|| navigator.userAgent.toLowerCase().indexOf("novarra") > -1
			|| navigator.userAgent.toLowerCase().indexOf("o2") > -1
			|| navigator.userAgent.toLowerCase().indexOf("opera mini") > -1
			|| navigator.userAgent.toLowerCase().indexOf("opera.mobi") > -1
			|| navigator.userAgent.toLowerCase().indexOf("pantech") > -1
			|| navigator.userAgent.toLowerCase().indexOf("pdxgw") > -1
			|| navigator.userAgent.toLowerCase().indexOf("pg") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ppc") > -1
			|| navigator.userAgent.toLowerCase().indexOf("pt") > -1
			|| navigator.userAgent.toLowerCase().indexOf("palm") > -1
			|| navigator.userAgent.toLowerCase().indexOf("panasonic") > -1
			|| navigator.userAgent.toLowerCase().indexOf("philips") > -1
			|| navigator.userAgent.toLowerCase()
					.indexOf("playstation portable") > -1
			|| navigator.userAgent.toLowerCase().indexOf("proxinet") > -1
			|| navigator.userAgent.toLowerCase().indexOf("proxinet") > -1
			|| navigator.userAgent.toLowerCase().indexOf("qtek") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sch") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sec") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sgh") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sharp-tq-gx10") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sie") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sph") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sagem") > -1
			|| navigator.userAgent.toLowerCase().indexOf("samsung") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sanyo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sendo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sharp") > -1
			|| navigator.userAgent.toLowerCase().indexOf("small") > -1
			|| navigator.userAgent.toLowerCase().indexOf("smartphone") > -1
			|| navigator.userAgent.toLowerCase().indexOf("softbank") > -1
			|| navigator.userAgent.toLowerCase().indexOf("sonyericsson") > -1
			|| navigator.userAgent.toLowerCase().indexOf("symbian") > -1
			|| navigator.userAgent.toLowerCase().indexOf("symbian os") > -1
			|| navigator.userAgent.toLowerCase().indexOf("symbianos") > -1
			|| navigator.userAgent.toLowerCase().indexOf("ts21i-10") > -1
			|| navigator.userAgent.toLowerCase().indexOf("toshiba") > -1
			|| navigator.userAgent.toLowerCase().indexOf("treo") > -1
			|| navigator.userAgent.toLowerCase().indexOf("up.browser") > -1
			|| navigator.userAgent.toLowerCase().indexOf("up.link") > -1
			|| navigator.userAgent.toLowerCase().indexOf("uts") > -1
			|| navigator.userAgent.toLowerCase().indexOf("vertu") > -1
			|| navigator.userAgent.toLowerCase().indexOf("willcome") > -1
			|| navigator.userAgent.toLowerCase().indexOf("winwap") > -1
			|| navigator.userAgent.toLowerCase().indexOf("windows ce") > -1
			|| navigator.userAgent.toLowerCase().indexOf("windows.ce") > -1
			|| navigator.userAgent.toLowerCase().indexOf("xda") > -1
			|| navigator.userAgent.toLowerCase().indexOf("zte") > -1
			|| navigator.userAgent.toLowerCase().indexOf("dopod") > -1
			|| navigator.userAgent.toLowerCase().indexOf("hiptop") > -1
			|| navigator.userAgent.toLowerCase().indexOf("htc") > -1
			|| navigator.userAgent.toLowerCase().indexOf("i-mobile") > -1
			|| navigator.userAgent.toLowerCase().indexOf("nokia") > -1
			|| navigator.userAgent.toLowerCase().indexOf("portalmmm") > -1) {
		if (navigator.platform.toLowerCase().indexOf("win32") == -1
				&& navigator.platform.toLowerCase().indexOf("win64") == -1) {
			return true
		} else {
			return false
		}
	} else {
		return false
	}
}
if (isMobileOut()) {
	$("head")
			.append(
					'<meta name="viewport" id="vpFerroMenu" content="width=device-width, minimum-scale = 1.0, maximum-scale = 1.0, initial-scale=1.0, user-scalable=no"/>')
}
(function(e) {
	var t = {
		ferroMenuCreate : function(t) {
			function T(e, t, n) {
				if (t.addEventListener)
					t.addEventListener(e, n, false);
				else if (t.attachEvent) {
					t.attachEvent("on" + e, n)
				} else {
					t[e] = n
				}
			}
			function N(e) {
				s[e] = false
			}
			function C(t) {
				if (t.which == 1 || t.type == "touchstart") {
					t.preventDefault();
					if (!e("#ferromenu-controller").hasClass("open")) {
						a = true;
						if (i.drag) {
							M("menudragstart")
						}
						if (!p) {
							t.preventDefault();
							try {
								f = t.clientX;
								l = t.clientX;
								c = t.clientY;
								h = t.clientY
							} catch (n) {
							}
						} else {
							try {
								f = t.touches[0].pageX;
								l = t.touches[0].pageX;
								c = t.touches[0].pageY;
								h = t.touches[0].pageY
							} catch (n) {
							}
						}
					}
				}
			}
			function k(t) {
				if (a && i.drag) {
					if (!p) {
						t.preventDefault();
						try {
							v = t.clientX - f;
							m = t.clientY - c
						} catch (n) {
						}
					} else {
						try {
							v = t.touches[0].pageX - f;
							m = t.touches[0].pageY - c
						} catch (n) {
						}
					}
					e("#ferromenu-controller").get(0).style.webkitTransform = "translate("
							+ v + "px," + m + "px)";
					e("#ferromenu-controller").get(0).style.MozTransform = "translate("
							+ v + "px," + m + "px)";
					e("#ferromenu-controller").get(0).style.msTransform = "translate("
							+ v + "px," + m + "px)";
					e("#ferromenu-controller").get(0).style.OTransform = "translate("
							+ v + "px," + m + "px)";
					e("#ferromenu-controller").get(0).style.transform = "translate("
							+ v + "px," + m + "px)";
					d = true;
					M("menudrag")
				}
			}
			function L(t) {
				if (t.which == 1 || t.type == "touchend") {
					t.preventDefault();
					a = false;
					if (!d || !i.drag) {
						e.fn.ferroMenu.toggleMenu();
						f = 0;
						l = 0;
						c = 0;
						h = 0
					} else {
						d = false;
						var n = e("#ferromenu-controller").offset().left;
						var r = e("#ferromenu-controller").offset().top;
						var s = "left";
						var u = "top";
						var p = {};
						if (n >= e(window).width() / 3
								&& n < 2 * e(window).width() / 3) {
							var s = "center";
							p.x = e(window).width() / 2
									- e("#ferromenu-controller").width() / 2
						} else if (n >= 2 * e(window).width() / 3) {
							var s = "right";
							p.x = e(window).width()
									- e("#ferromenu-controller").outerWidth()
									- i.margin
						} else {
							var s = "left";
							p.x = i.margin
						}
						if (r >= e(window).height() / 3
								&& r < 2 * e(window).height() / 3) {
							var u = "center";
							p.y = e(window).height() / 2
									- e("#ferromenu-controller").outerHeight()
									/ 2
						} else if (r >= e(window).height() / 3) {
							var u = "bottom";
							p.y = e(window).height()
									- e("#ferromenu-controller").outerWidth()
									- i.margin
						} else {
							var u = "top";
							p.y = i.margin
						}
						o = s + "-" + u;
						e("#ferromenu-controller").get(0).style.webkitTransition = "all 0.2s";
						e("#ferromenu-controller").get(0).style.MozTransition = "all 0.2s";
						e("#ferromenu-controller").get(0).style.msTransition = "all 0.2s";
						e("#ferromenu-controller").get(0).style.OTransition = "all 0.2s";
						e("#ferromenu-controller").get(0).style.transition = "all 0.2s";
						var v = p.x
								- e("#ferromenu-controller").data(
										"startingPosition").x;
						var m = p.y
								- e("#ferromenu-controller").data(
										"startingPosition").y;
						e("#ferromenu-controller").get(0).style.webkitTransform = "translate("
								+ v + "px," + m + "px)";
						e("#ferromenu-controller").get(0).style.MozTransform = "translate("
								+ v + "px," + m + "px)";
						e("#ferromenu-controller").get(0).style.msTransform = "translate("
								+ v + "px," + m + "px)";
						e("#ferromenu-controller").get(0).style.OTransform = "translate("
								+ v + "px," + m + "px)";
						e("#ferromenu-controller").get(0).style.transform = "translate("
								+ v + "px," + m + "px)";
						setTimeout(function() {
							O()
						}, 210);
						if (i.drag) {
							M("menudragend")
						}
					}
				}
			}
			function A() {
				e(r + " > li").each(
						function(t) {
							s[t] = true;
							var n = e(this).data("end").left;
							var r = e(this).data("end").top;
							this.style.opacity = 1;
							this.style.webkitTransform = "translate(" + n
									+ "px," + r + "px)";
							this.style.MozTransform = "translate(" + n + "px,"
									+ r + "px)";
							this.style.msTransform = "translate(" + n + "px,"
									+ r + "px)";
							this.style.OTransform = "translate(" + n + "px,"
									+ r + "px)";
							this.style.transform = "translate(" + n + "px," + r
									+ "px)";
							N(t)
						})
			}
			function O() {
				e(r + " > li")
						.each(
								function(t) {
									e(this).css({
										display : "inline-block",
										position : "absolute",
										zIndex : 999
									});
									s[t] = false;
									e("#ferromenu-controller").removeAttr(
											"style");
									e("#ferromenu-controller")
											.removeClass(
													"left-bottom center-bottom right-bottom left-top center-top right-top left-center right-center center-center");
									e("#ferromenu-controller").addClass(o);
									e(this).addClass(g);
									switch (o) {
									case "left-bottom":
										e("#ferromenu-controller").css({
											bottom : 0,
											left : 0,
											marginLeft : i.margin,
											marginBottom : i.margin,
											zIndex : 1e3
										});
										var n = -Math.PI / 2 + t
												* (Math.PI / 2 / b);
										var u = i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "center-bottom":
										e("#ferromenu-controller")
												.css(
														{
															bottom : 0,
															left : "50%",
															marginLeft : -(e(
																	"#ferromenu-controller")
																	.width() / 2),
															marginBottom : i.margin,
															zIndex : 1e3
														});
										var n = Math.PI + t * (Math.PI / b);
										var u = i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "right-bottom":
										e("#ferromenu-controller").css({
											bottom : 0,
											right : 0,
											marginRight : i.margin,
											marginBottom : i.margin,
											zIndex : 1e3
										});
										var n = Math.PI + t * (Math.PI / 2 / b);
										var u = i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "left-top":
										e("#ferromenu-controller").css({
											top : 0,
											left : 0,
											marginLeft : i.margin,
											marginTop : i.margin,
											zIndex : 1e3
										});
										var n = -Math.PI / 2 + t
												* (Math.PI / 2 / b);
										var u = -i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "center-top":
										e("#ferromenu-controller")
												.css(
														{
															top : 0,
															left : "50%",
															marginLeft : -(e(
																	"#ferromenu-controller")
																	.width() / 2),
															marginTop : i.margin,
															zIndex : 1e3
														});
										var n = Math.PI + t * (Math.PI / b);
										var u = -i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "right-top":
										e("#ferromenu-controller").css({
											top : 0,
											right : 0,
											marginRight : i.margin,
											marginTop : i.margin,
											zIndex : 1e3
										});
										var n = Math.PI + t * (Math.PI / 2 / b);
										var u = -i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "left-center":
										e("#ferromenu-controller")
												.css(
														{
															top : "60%",
															left : 0,
															marginTop : -(e(
																	"#ferromenu-controller")
																	.height() / 2),
															marginLeft : i.margin,
															zIndex : 1e3
														});
										var n = -Math.PI / 2 + t
												* (Math.PI / b);
										var u = i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break;
									case "right-center":
										e("#ferromenu-controller")
												.css(
														{
															top : "50%",
															right : 0,
															marginTop : -(e(
																	"#ferromenu-controller")
																	.height() / 2),
															marginRight : i.margin,
															zIndex : 1e3
														});
										var n = -Math.PI / 2 + t
												* (Math.PI / b);
										var u = i.radius * Math.sin(n);
										var a = -i.radius * Math.cos(n);
										break;
									case "center-center":
										e("#ferromenu-controller")
												.css(
														{
															top : "50%",
															left : "50%",
															marginTop : -(e(
																	"#ferromenu-controller")
																	.height() / 2),
															marginLeft : -(e(
																	"#ferromenu-controller")
																	.width() / 2),
															zIndex : 1e3
														});
										var n = -Math.PI
												/ 2
												+ t
												* (Math.PI * 2 / e(r)
														.find("li").length);
										var u = i.radius * Math.sin(n);
										var a = i.radius * Math.cos(n);
										break
									}
									e("#ferromenu-controller").data(
											"startingPosition",
											{
												x : e("#ferromenu-controller")
														.offset().left,
												y : e("#ferromenu-controller")
														.offset().top
											});
									e(this)
											.css(
													{
														top : e(
																"#ferromenu-controller")
																.offset().top
																+ e(
																		"#ferromenu-controller")
																		.outerHeight()
																/ 2
																- e(this)
																		.height()
																/ 2,
														left : e(
																"#ferromenu-controller")
																.offset().left
																+ e(
																		"#ferromenu-controller")
																		.outerWidth()
																/ 2
																- e(this)
																		.width()
																/ 2
													});
									if (u <= .1 && u >= -.1) {
										u = 0
									}
									if (a <= .1 && a >= -.1) {
										a = 0
									}
									e(this).data({
										end : {
											top : u,
											left : a
										}
									})
								})
			}
			function M(t) {
				var n = {
					position : o,
					opened : u
				};
				e.event.trigger({
					type : t,
					menustatus : n
				})
			}
			function p() {
				if (navigator.userAgent.toLowerCase().indexOf("android") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"blackberry9500") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"blackberry9530") > -1
						|| navigator.userAgent.toLowerCase().indexOf("cupcake") > -1
						|| navigator.userAgent.toLowerCase().indexOf("dream") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"incognito") > -1
						|| navigator.userAgent.toLowerCase().indexOf("iphone") > -1
						|| navigator.userAgent.toLowerCase().indexOf("ipod") > -1
						|| navigator.userAgent.toLowerCase().indexOf("ipad") > -1
						|| navigator.userAgent.toLowerCase().indexOf("mini") > -1
						|| navigator.userAgent.toLowerCase().indexOf("webos") > -1
						|| navigator.userAgent.toLowerCase().indexOf("webmate") > -1
						|| navigator.userAgent.toLowerCase().indexOf("2.0 mmp") > -1
						|| navigator.userAgent.toLowerCase().indexOf("240×320") > -1
						|| navigator.userAgent.toLowerCase().indexOf("asus") > -1
						|| navigator.userAgent.toLowerCase().indexOf("au-mic") > -1
						|| navigator.userAgent.toLowerCase().indexOf("alcatel") > -1
						|| navigator.userAgent.toLowerCase().indexOf("amoi") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("audiovox") > -1
						|| navigator.userAgent.toLowerCase().indexOf("avantgo") > -1
						|| navigator.userAgent.toLowerCase().indexOf("benq") > -1
						|| navigator.userAgent.toLowerCase().indexOf("bird") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"blackberry") > -1
						|| navigator.userAgent.toLowerCase().indexOf("blazer") > -1
						|| navigator.userAgent.toLowerCase().indexOf("cdm") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"cellphone") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"ddipocket") > -1
						|| navigator.userAgent.toLowerCase().indexOf("danger") > -1
						|| navigator.userAgent.toLowerCase().indexOf("docomo") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"elaine/3.0") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("ericsson") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"eudoraweb") > -1
						|| navigator.userAgent.toLowerCase().indexOf("fly") > -1
						|| navigator.userAgent.toLowerCase().indexOf("hp.ipaq") > -1
						|| navigator.userAgent.toLowerCase().indexOf("haier") > -1
						|| navigator.userAgent.toLowerCase().indexOf("huawei") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("iemobile") > -1
						|| navigator.userAgent.toLowerCase().indexOf("j-phone") > -1
						|| navigator.userAgent.toLowerCase().indexOf("kddi") > -1
						|| navigator.userAgent.toLowerCase().indexOf("konka") > -1
						|| navigator.userAgent.toLowerCase().indexOf("kwc") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"kyocera/wx310k") > -1
						|| navigator.userAgent.toLowerCase().indexOf("lg") > -1
						|| navigator.userAgent.toLowerCase().indexOf("lg/u990") > -1
						|| navigator.userAgent.toLowerCase().indexOf("lenovo") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("midp-2.0") > -1
						|| navigator.userAgent.toLowerCase().indexOf("mmef20") > -1
						|| navigator.userAgent.toLowerCase().indexOf("mot-v") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"mobilephone") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("motorola") > -1
						|| navigator.userAgent.toLowerCase().indexOf("newgen") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("netfront") > -1
						|| navigator.userAgent.toLowerCase().indexOf("newt") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"nintendo wii") > -1
						|| navigator.userAgent.toLowerCase().indexOf("nitro") > -1
						|| navigator.userAgent.toLowerCase().indexOf("nokia") > -1
						|| navigator.userAgent.toLowerCase().indexOf("novarra") > -1
						|| navigator.userAgent.toLowerCase().indexOf("o2") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"opera mini") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"opera.mobi") > -1
						|| navigator.userAgent.toLowerCase().indexOf("pantech") > -1
						|| navigator.userAgent.toLowerCase().indexOf("pdxgw") > -1
						|| navigator.userAgent.toLowerCase().indexOf("pg") > -1
						|| navigator.userAgent.toLowerCase().indexOf("ppc") > -1
						|| navigator.userAgent.toLowerCase().indexOf("pt") > -1
						|| navigator.userAgent.toLowerCase().indexOf("palm") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"panasonic") > -1
						|| navigator.userAgent.toLowerCase().indexOf("philips") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"playstation portable") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("proxinet") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("proxinet") > -1
						|| navigator.userAgent.toLowerCase().indexOf("qtek") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sch") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sec") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sgh") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"sharp-tq-gx10") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sie") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sph") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sagem") > -1
						|| navigator.userAgent.toLowerCase().indexOf("samsung") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sanyo") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sendo") > -1
						|| navigator.userAgent.toLowerCase().indexOf("sharp") > -1
						|| navigator.userAgent.toLowerCase().indexOf("small") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"smartphone") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("softbank") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"sonyericsson") > -1
						|| navigator.userAgent.toLowerCase().indexOf("symbian") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"symbian os") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"symbianos") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("ts21i-10") > -1
						|| navigator.userAgent.toLowerCase().indexOf("toshiba") > -1
						|| navigator.userAgent.toLowerCase().indexOf("treo") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"up.browser") > -1
						|| navigator.userAgent.toLowerCase().indexOf("up.link") > -1
						|| navigator.userAgent.toLowerCase().indexOf("uts") > -1
						|| navigator.userAgent.toLowerCase().indexOf("vertu") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("willcome") > -1
						|| navigator.userAgent.toLowerCase().indexOf("winwap") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"windows ce") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"windows.ce") > -1
						|| navigator.userAgent.toLowerCase().indexOf("xda") > -1
						|| navigator.userAgent.toLowerCase().indexOf("zte") > -1
						|| navigator.userAgent.toLowerCase().indexOf("dopod") > -1
						|| navigator.userAgent.toLowerCase().indexOf("hiptop") > -1
						|| navigator.userAgent.toLowerCase().indexOf("htc") > -1
						|| navigator.userAgent.toLowerCase()
								.indexOf("i-mobile") > -1
						|| navigator.userAgent.toLowerCase().indexOf("nokia") > -1
						|| navigator.userAgent.toLowerCase().indexOf(
								"portalmmm") > -1) {
					if (navigator.platform.toLowerCase().indexOf("win32") == -1
							&& navigator.platform.toLowerCase()
									.indexOf("win64") == -1) {
						return true
					} else {
						return false
					}
				} else {
					return false
				}
			}
			var n = {
				closeTime : 500,
				delay : 0,
				drag : true,
				easing : "cubic-bezier(0.680, -0.550, 0.265, 1.550)",
				margin : 10,
				position : "left-bottom",
				radius : 150,
				rotation : 0,
				opened : false,
				openTime : 500
			};
			var r = this.selector;
			var i = e.extend({}, n, t);
			var s = new Array;
			var o = i.position;
			var u = i.opened;
			var a = false;
			var f = 0;
			var l = 0;
			var c = 0;
			var h = 0;
			var p = p();
			var d = false;
			var v = 0;
			var m = 0;
			var g = p ? "mobile" : "desktop";
			var y = u ? "open" : "";
			var b = e(r).find("li").length - 1;
			e("body")
					.append(
							"<a id='ferromenu-controller' class='"
									+ g
									+ " "
									+ y
									+ "' href='javascript:void(0);'><div class='label'>+</div></a>");
			e(r + " > li").css({
				opacity : 0
			});
			O();
			if (i.opened) {
				A()
			}
			T("resize", window, O);
			T("orientationchange", window, function() {
				var e = setTimeout(function() {
					O()
				}, 200)
			});
			var w = "ontouchstart" in window;
			var E = w ? "touchstart" : "mousedown";
			var S = w ? "touchmove" : "mousemove";
			var x = w ? "touchend" : "mouseup";
			T(E, e("#ferromenu-controller").get(0), C);
			T(S, window, k);
			T(x, e("#ferromenu-controller").get(0), L);
			M("menuready");
			e.fn.ferroMenu.toggleMenu = function() {
				var t = true;
				for ( var n = 0; n < s.length; n++) {
					if (s[n]) {
						t = false
					}
				}
				if (t) {
					e("#ferromenu-controller").toggleClass("open");
					u = e("#ferromenu-controller").hasClass("open");
					if (e("#ferromenu-controller").hasClass("open")) {
						e(r + " > li").each(
								function(t) {
									s[t] = true;
									var n = e(this).data("end").left;
									var r = e(this).data("end").top;
									this.style.webkitTransition = "all "
											+ i.openTime / 1e3 + "s "
											+ i.easing + " " + t * i.delay
											/ 1e3 + "s";
									this.style.MozTransition = "all "
											+ i.openTime / 1e3 + "s "
											+ i.easing + " " + t * i.delay
											/ 1e3 + "s";
									this.style.msTransition = "all "
											+ i.openTime / 1e3 + "s "
											+ i.easing + " " + t * i.delay
											/ 1e3 + "s";
									this.style.OTransition = "all "
											+ i.openTime / 1e3 + "s "
											+ i.easing + " " + t * i.delay
											/ 1e3 + "s";
									this.style.transition = "all " + i.openTime
											/ 1e3 + "s " + i.easing + " " + t
											* i.delay / 1e3 + "s";
									this.style.opacity = 1;
									this.style.webkitTransform = "translate("
											+ n + "px," + r + "px) rotate("
											+ i.rotation + "deg)";
									this.style.MozTransform = "translate(" + n
											+ "px," + r + "px) rotate("
											+ i.rotation + "deg)";
									this.style.msTransform = "translate(" + n
											+ "px," + r + "px) rotate("
											+ i.rotation + "deg)";
									this.style.OTransform = "translate(" + n
											+ "px," + r + "px) rotate("
											+ i.rotation + "deg)";
									this.style.transform = "translate(" + n
											+ "px," + r + "px) rotate("
											+ i.rotation + "deg)";
									setTimeout(function() {
										N(t)
									}, i.openTime / 1e3)
								});
						M("menuopened")
					} else {
						e(r + " > li")
								.each(
										function(t) {
											s[t] = true;
											this.style.webkitTransition = "all "
													+ i.closeTime
													/ 1e3
													+ "s "
													+ i.easing
													+ " "
													+ (e(r + " > li").length - t)
													* i.delay / 1e3 + "s";
											this.style.MozTransition = "all "
													+ i.closeTime
													/ 1e3
													+ "s "
													+ i.easing
													+ " "
													+ (e(r + " > li").length - t)
													* i.delay / 1e3 + "s";
											this.style.msTransition = "all "
													+ i.closeTime
													/ 1e3
													+ "s "
													+ i.easing
													+ " "
													+ (e(r + " > li").length - t)
													* i.delay / 1e3 + "s";
											this.style.OTransition = "all "
													+ i.closeTime
													/ 1e3
													+ "s "
													+ i.easing
													+ " "
													+ (e(r + " > li").length - t)
													* i.delay / 1e3 + "s";
											this.style.transition = "all "
													+ i.closeTime
													/ 1e3
													+ "s "
													+ i.easing
													+ " "
													+ (e(r + " > li").length - t)
													* i.delay / 1e3 + "s";
											this.style.opacity = 0;
											this.style.webkitTransform = "translate(0px,0px) rotate(-"
													+ i.rotation + "deg)";
											this.style.MozTransform = "translate(0px,0px) rotate(-"
													+ i.rotation + "deg)";
											this.style.msTransform = "translate(0px,0px) rotate(-"
													+ i.rotation + "deg)";
											this.style.OTransform = "translate(0px,0px) rotate(-"
													+ i.rotation + "deg)";
											this.style.transform = "translate(0px,0px) rotate(-"
													+ i.rotation + "deg)";
											setTimeout(function() {
												N(t)
											}, i.closeTime / 1e3)
										});
						M("menuclosed")
					}
				}
			}
		}
	};
	e.fn.ferroMenu = function(e) {
		return t.ferroMenuCreate.call(this, e)
	}
})(jQuery)