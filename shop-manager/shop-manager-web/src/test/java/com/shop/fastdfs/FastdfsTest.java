package com.shop.fastdfs;

import org.csource.fastdfs.*;
import org.junit.Test;

/**
 * Created by ed on 2017/8/17.
 */
public class FastdfsTest {
    @Test
    public void testUpload() throws Exception {
        // 1、把FastDFS提供的jar包添加到工程中
        // 2、初始化全局配置。加载一个配置文件。
        ClientGlobal.init("S:\\mywork\\shop-parent\\shop-manager\\shop-manager-web\\src\\main\\resources\\client.conf");
        // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("S:\\QQ\\282118010\\FileRecv\\MobileFile\\IMG_20161218_142255.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void testFastDfsClient() throws Exception {
        FastDFSClient client = new FastDFSClient("S:\\mywork\\shop-parent\\shop-manager\\shop-manager-web\\src\\main\\resources\\client.conf");
        String uploadFile = client.uploadFile("S:\\QQ\\282118010\\FileRecv\\MobileFile\\mmexport1499927480732.jpg", "jpg");
        System.out.println(uploadFile);
    }


}
