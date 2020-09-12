<%-- 
    Document   : aside
    Created on : Mar 10, 2020, 8:29:20 AM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<aside class="col-sm-3">
                <!--CartInfo-->
                <div class="poly-cart">
	                <div class="panel panel-default">
	                    <div class="panel-body">
	                        <img class="col-sm-5" src="images/shoppingcart.gif" />
	                        <ul class="col-sm-7">
	                            <li>100 items</li>
	                            <li>$ 56.8</li>
	                            <li><a href="">View Cart</a></li>
	                        </ul>
	                    </div>
	                </div>
                </div>
                <!--/CartInfo-->

                <!--Search-->
                <div class="nn-cart">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <form method="post" action="/Product/Search">
                                <input placeholder="Keywords" name="Keywords" class="form-control" />
                            </form>
                        </div>
                    </div>
                </div>
                <!--/Search-->

                <!--Category-->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <span class="glyphicon glyphicon-th-list"></span>
                        <strong>Chủng loại</strong>
                    </div>

                    <div class="list-group">
                        <a href="#" class="list-group-item">Điện thoại di động</a>
                        <a href="#" class="list-group-item">Máy tính xách tay</a>
                        <a href="#" class="list-group-item">Máy tính để bàn</a>
                        <a href="#" class="list-group-item">Quạt máy</a>
                        <a href="#" class="list-group-item">Tivi</a>
                        <a href="#" class="list-group-item">Tủ lạnh</a>
                    </div>
                </div>
                <!--/Category-->

                <!--Supplier-->
                <div class="panel panel-default">

                    <div class="panel-heading">
                        <span class="glyphicon glyphicon-list-alt"></span>
                        <strong>Nhà cung cấp</strong>
                    </div>

                    <div class="list-group">
                        <a href="#" class="list-group-item">Apple</a>
                        <a href="#" class="list-group-item">Samsung</a>
                        <a href="#" class="list-group-item">Nokia</a>
                        <a href="#" class="list-group-item">GL</a>
                        <a href="#" class="list-group-item">Sony Ericson</a>
                        <a href="#" class="list-group-item">Dell</a>
                        <a href="#" class="list-group-item">Acer</a>
                        <a href="#" class="list-group-item">HP</a>
                        <a href="#" class="list-group-item">Toshiba</a>
                    </div>
                </div>
                <!--/Supplier-->

                <!--Special-->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <span class="glyphicon glyphicon-star-empty"></span>
                        <strong>Hàng đặc biệt</strong>
                    </div>

                    <div class="list-group">
                        <a href="#" class="list-group-item">Hàng bán chạy</a>
                        <a href="#" class="list-group-item">Hàng mới</a>
                        <a href="#" class="list-group-item">Hàng giảm giá</a>
                        <a href="#" class="list-group-item">Hàng đặc biệt</a>
                        <a href="#" class="list-group-item">Hàng xem nhiều</a>
                    </div>
                </div>
                <!--/Special-->

            </aside>
