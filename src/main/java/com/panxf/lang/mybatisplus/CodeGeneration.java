//package com.panxf.lang.mybatisplus;
//
////
////                            _ooOoo_
////                           o8888888o
////                           88" . "88
////                           (| -_- |)
////                           O\  =  /O
////                        ____/`---'\____
////                      .'  \\|     |//  `.
////                     /  \\|||  :  |||//  \
////                    /  _||||| -:- |||||-  \
////                    |   | \\\  -  /// |   |
////                    | \_|  ''\---/''  |   |
////                    \  .-\__  `-`  ___/-. /
////                  ___`. .'  /--.--\  `. . __
////               ."" '<  `.___\_<|>_/___.'  >'"".
////              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
////              \  \ `-.   \_ __\ /__ _/   .-` /  /
////         ======`-.____`-.___\_____/___.-`____.-'======
////                            `=---='
////        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
////                      Buddha Bless, No Bug !
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * @ClassName: CodeGeneration  2.1.8
// * @Description: TODO
// * @Author panxiufeng
// * @Date 2019/4/21下午5:31
// */
//public class CodeGeneration {
//
//    public static void main(String[] args) {
//        AutoGenerator mpg = new AutoGenerator();
//
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
////        gc.setOutputDir("/data/");
//        gc.setOutputDir("D://mybatisplus-codegen/");
//        gc.setFileOverride(true);
//        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
//        gc.setEnableCache(false);// XML 二级缓存
//        gc.setBaseResultMap(true);// XML ResultMap
//        gc.setBaseColumnList(false);// XML columList
//        //gc.setKotlin(true);//是否生成 kotlin 代码
//        gc.setAuthor("panxiufeng");// 作者
//
//        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//        gc.setControllerName("%sController");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert(){
//            // 自定义数据库表字段类型转换【可选】
//            public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
//                System.out.println("转换类型：" + fieldType);
////                 if ( fieldType.toLowerCase().contains("tinyint")&& fieldType.length()==1 ) {
////                    return DbColumnType.BOOLEAN;
////                 }
//                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//                return super.processTypeConvert(fieldType);
//            }
//        });
//        dsc.setDriverName("com.mysql.jdbc.Driver");
////        dsc.setUsername("root");
////        dsc.setPassword("123456");
////        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/panxf_user");
//        dsc.setUsername("dev");
//        dsc.setPassword("wdphdev2018");
//        dsc.setUrl("jdbc:mysql://10.53.156.240:3306/panxf_user");
//        mpg.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
////        strategy.setTablePrefix(new String[] { "user_" });// 此处可以修改为您的表前缀
//        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//        strategy.setInclude(new String[] { "user_menu_info", "user_organ_info", "user_organ_relation", "user_permission_info", "user_personal_info", "user_role_info", "user_role_permission_relation", "user_role_relation" }); // 需要生成的表
//        strategy.setSuperServiceClass(null);
//        strategy.setSuperServiceImplClass(null);
//        strategy.setSuperMapperClass(null);
//        mpg.setStrategy(strategy);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.panxf.user.dal");
//        pc.setController("controller");
//        pc.setService("service");
//        pc.setServiceImpl("serviceImpl");
//        pc.setMapper("mapper");
//        pc.setEntity("entity");
//        pc.setXml("xml");
//        mpg.setPackageInfo(pc);
//
//
//        // 执行生成
//        mpg.execute();
//
//    }
//
//
//}
