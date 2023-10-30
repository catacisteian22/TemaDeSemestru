//package main.repository;
//
//import main.model.Wishlist;
//
//import java.util.List;
//
//public class WishlistRepo implements InMemoryRepo<Wishlist> {
//
//    List<Wishlist> wishList;
//
//    public WishlistRepo(List<Wishlist> wishlist) {
//
//        this.wishList = wishlist;
//    }
//
//    public void add(Wishlist k){
//        wishList.add(k);
//    }
//
//    public Wishlist getById(String id) {
//        for (Wishlist wishlist : wishList) {
//            if (wishlist.getIdWishlist() == id) {
//                return wishlist;
//            }
//        }
//        return null;
//    }
//
//    public List<Wishlist> getAll() {
//        return wishList;
//    }
//}
