/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remember;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class MonHocDao {
      List<Monhoc> ls = new ArrayList<>();
      public int add(Monhoc mh){
          ls.add(mh);
          return 1;
      }
      public int cout(){
          return ls.size();
      }
      public List<Monhoc> getAllMonhoc(){
          return ls;
      }
      public int find(String ma){
          for (int i = 0; i < ls.size(); i++) {
              if (ls.get(i).getMaMon().equalsIgnoreCase(ma)) {
                  return i;
              }
          }
          return -1;
      }
      public int edit(Monhoc mh){
          int pos = find(mh.getMaMon());
          if (pos >= 0) {
              ls.set(pos, mh);
              return pos;
          }
          return -1;
      }
      public List<Monhoc> getFind(String find){
          List<Monhoc> lsFind = new ArrayList<>();
          for (Monhoc mh : ls) {
              if (mh.getMaMon().toLowerCase().contains(find) || mh.getTenMon().toLowerCase().contains(find)) {
                  lsFind.add(mh);
              }
          }
          return lsFind;
      }
      public int del(String id){
          int pos = find(id);
          if (pos >= 0) {
              ls.remove(pos);
              return pos;
          }
          return -1;
      }
      public Monhoc getMonHocByPosition(int id){
          return ls.get(id);
      }
}
