package cn.iocoder.mall.admin.convert;

import cn.iocoder.mall.admin.api.bo.sms.SmsTemplateBO;
import cn.iocoder.mall.admin.dataobject.SmsTemplateDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * 短信 template
 *
 * @author Sin
 * @time 2019/5/16 7:43 PM
 */
@Mapper
public interface SmsTemplateConvert {

    SmsTemplateConvert INSTANCE = Mappers.getMapper(SmsTemplateConvert.class);

    @Mappings({})
    SmsTemplateBO convert(SmsTemplateDO smsTemplateDO);
}
