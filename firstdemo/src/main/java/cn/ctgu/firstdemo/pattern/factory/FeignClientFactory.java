package cn.ctgu.firstdemo.pattern.factory;

public class FeignClientFactory {

    public static <T extends FeignClient> T getFeginClient(ClientEnum clientEnum){
        switch (clientEnum.name()){
            case "Nova":
                return (T) new NovaFeignClient();
            case "Uaa":
                return (T) new UaaFeigClient();
            default:
                break;
        }
        return null;

    }

    public static void main(String[] args) {

        NovaFeignClient novaFeignClient=FeignClientFactory.getFeginClient(ClientEnum.Nova);
        novaFeignClient.sayHello();
        UaaFeigClient uaaFeigClient=FeignClientFactory.getFeginClient(ClientEnum.Uaa);
        uaaFeigClient.sayHello();

    }
}
