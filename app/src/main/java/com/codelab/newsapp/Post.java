package com.codelab.newsapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {
    /**
     * ID : 22
     * post_title : الويب الخفي - الديب ويب
     * guid : http://codelab.d3stud.io/?p=22
     * post_content : الويب الخفي – الديب ويب: ربما تظن أنك تعرف الانترنت جيدًا، لكن مواقع مثل فيسبوك، أمازون، وانستاجرام، هي مجرد السطح الخارجي. هناك عالم آخر بكامله تحت هذا السطح: الشبكة العميقة.
     * هذه الأعماق هي المكان الذي يكون فيه تداول المعلومات مؤمنًا بكلمة سر، محميًا خلف أسوار المناطق غير المجانية، أو يحتاج إلى برمجيات خاصة للوصول إليه، وهو مكان في غاية الضخامة. يقدر البعض هذا الجزء بأنه يبلغ 500 ضعفًا من حجم الشبكة المنظورة التي يتصفحها الناس يوميًا. بالرغم من ذلك فهذا الجزء شبه غائب تمامًا عن النظر. فبحسب دراسة نشرت في نشرة “الطبيعة” Nature يقوم جوجل بتبويب ما لايزيد عن 16% من سطح الشبكة، و يغفل تمامُا كل الشبكة العميقة. أي محاولة بحث لا ينتج عنها إلا 0.03% من المعلومات الموجودة على الانترنت (صفحة من كل 3000 صفحة). يشبه الأمر القيام بالصيد في جزء يقل عمقه عن المتر في المحيط كله، هنا أنت تغفل “ماريانا ترينش”[1] التخيلي الكامن أسفل السطح.
     * معظم مناطق الشبكة العميقة الغير مبوبة تقع في قواعد البيانات اليومية البسيطة، مثل ليكسيز-نيكسيز[2] أو سجلات مكتب براءات الاختراع بالولايات المتحدة. لكن على غرار دمية ماتريوشكا الروسية، تحتوي الشبكة العميقة على عالم أشد عمقًا، مجتمع أصغر لكنه شديد الأهمية، حيث يجتمع الأشرار لتحقيق أغراض دنيئة. مرحبًا بك في الشبكة المظلمة، والتي تسمى أحيانًا دارك-نت Darknet، وهو قبو رقمي ضخم يجتمع فيه الهاكرز ورجال العصابات والإرهابيون والبيدوفايلز[3] ليمارسوا تجاراتهم. في السطور التالية سنعرض لك ما لا يزيد عن عينة سريعة من البضائع والخدمات التي يتم تداولها في أعمق كهوف الشبكة وأشدها ظلمة.
     * الأشياء التي يمكنك شراءها:
     * 1- المخدرات
     * كميات فردية أو تجارية من المخدرات القانونية و الغير قانونية من كل الأنواع متاحة للبيع في القبو الرقمي. متجر الطريق الحريري Silk Road الألكتروني، أكبر متجر للمخدرات والذي تم إغلاقه الآن، بلغ حجم أعماله 200 مليون دولار في خلال 28 شهرًا.
     * 2- العملة المقلدة
     * النقود المزورة تتباين فيما بينها كثيرًا من حيث الجودة والتكلفة، لكن اليورو، والجنيه الاسترليني، والين، كلهم متاحون للبيع. ستمائة دولار قد توفر لك شراء 2500 دولار من العملة الأميريكية المقلدة، مع وعد بقدرة العملة المقلدة على تخطي قلم الفحص والأشعة فوق البنفسجية.
     * 3- المستندات المزورة
     * جواز السفر، رخصة القيادة، أوراق الجنسية، إثباتات الشخصية المزورة، الشهادات الجامعية، أوراق الهجرة، بل وبطاقات إثبات الشخصية الديبلوماسية، كلها متاحة في السوق غير القانوني (مثل أونيون لخدمات الهوية). رخصة قيادة أميريكية تكلفك تقريبًا 200 دولارا أميريكيًا، بينما جواز السفر الأميريكي أو الإنجليزي سيكلفك بضعة آلاف من الدولارات.
     * 4- الأسلحة الشخصية، الذخيرة، المتفجرات
     * الأسلحة، مثل الطبنجة الشخصية، ومتفجرات C4 يمكن شراءها من الشبكة المظلمة. يشحن الباعة بضاعتهم في مغلفات خاصة لتجنب أشعة إكس، أو يبعثون بأجزاء السلاح مخبأة داخل ألعاب، أو آلات موسيقية أو أجهزة إلكترونية.
     * 5- القتلة المأجورون
     * مقدمي الخدمة – ومن بينهم شركة تسمى كولولهولو C’thulhu على اسم الوحش الذي ابتكره الكاتب ه. ب. لوفكرافت H.P. Lovecraft في رواياته – يقدمون دعاياتهم بعبارة “حلول دائمة لمشكلات شائعة”. هؤلاء القتلة المأجورون يقومون بكل شيء، بداية من الضغائن الشخصية حتى الاغتيالات السياسية، ويقبلون مقابل أعمالهم الدفع عن طريق البيتكوين (bitcoin) كأجرة، ويقدمون دليلا مصورًا على إتمام المهمة.
     * 6- الأعضاء البشرية
     * في الأركان الأشد ظلمة من الشبكة، تنتعش سوق سوداء ضخمة للأعضاء البشرية. الكلى قد تباع لقاء 200 ألف دولار، القلوب مقابل 120 ألف دولار، و الكبد مقابل 150 ألف دولار. زوج من الأعين يكلف 1500 دولارا.
     * الأشياء التي تجعل جرائم الانترنت ناجحة
     * 1- النقود المشفرة
     * النقود الرقمية (مثل بيتكوين ودارك-كوين)، ونظام دفع ليبرتي ريسيرف (Liberty Reserve) يقدمان نظامًا ملائمًا للمستخدمين لإنفاق الأموال أونلاين مع اخفاء هوياتهم الحقيقية.
     * 2- خدمة خالية من الثغرات لاستضافة المواقع
     * بعض مضيفي المواقع في روسيا وأوكرانيا يرحبون بأي محتوى، لا يحاولون بأي شكل معرفة هوية زبائنهم الحقيقية، و يقبلون الدفع مجهول الهوية بواسطة بيتكوين، و يتجاهلون باستمرار مذكرات الضبط والإحضار من السلطات.
     * 3- الحوسبة السحابية Cloud Computing:
     * عن طريق وضع برامجهم المؤذية Malware في ضيافة الشركات ذات السمعة النظيفة، لا يعاني الهاكرز من أي اعتراض لتداولاتهم من جانب الأنظمة الأمنية. أشارت دراسة حديثة أن 16% من البرمجيات المؤذية في العالم وقنوات توزع الهجمات الألكترونية بدأت من سحابة أمازون.
     * 4- برمجيات الجريمة
     * المجرمين الأقل مهارة بإمكانهم شراء كل الأدوات التي يحتاجونها للعثور على ثغرات النظام، و سرقة الهويات، و تهديد السيرفرات، و سرقة المعلومات. في عام 2013 لم يتطلب الأمر أكثر من هاكر يملك مجموعة أدوات مشابهة لغزو نظام نقاط بيع تارجت Target’s point-of-sale system .
     * 5- هاكرز للإيجار
     * نقابات الجريمة الألكترونية المنظمة تعرض الهاكرز للإيجار. مجموعة لينكس الصينية السرية تفخر بتوفر مايقرب من 100 لص ألكتروني محترف، بعضهم يعرف عنه أنه اخترق نظمًا لجوجل، و أدوبي، و لوكهيد مارتين.
     * 6- مراكز خدمة اتصالات الجرائم متعددة اللغات
     * هؤلاء الموظفون سيلعبون أي دور توده، مثل تقديم شهادات خبرة أو تدريب، بدء عملية نقل أموال، إعادة تشغيل حسابات مخترقة. المكالمة تكلفك مايقرب من 10 دولارات.
     * كيفية الوصول إلى برمجيات الشبكة المظلمة
     * – المتصفحات السرية
     * تور Tor وهو اختصار أونيون راوتر، هو واحد من البرامج العديدة التي تفتح بابًا للشبكة المظلمة. يقوم تور بتعديل اتجاه الإشارة عبر 6000 سيرفر ليخفي مصدر طلب الوصول لصفحة معينة، مما يجعل الضغطات على روابط ممنوعة لا يمكن اقتفاء أثرها من قبل السلطات. المتصفح يستخدم صفحات سرية متبوعة ب (.onion) بدلا من (.com) والي لا يمكن الوصول إليها إلا من خلال متصفح تور.
     * – محركات البحث السرية
     * في أواسط عام 2014، اخترع الهاكرز محرك بحث جرامز Grams، وهو محرك البحث الأول في الشبكة المظلمة الذي تم توزيعه بنطاق كبير. يتيح جرامز للمجرمين المستقبليين البحث عن المخدرات و السلاح و حسابات البنوك المسروقة عبر العديد من المواقع المخفية. الأدهى أنها تحتوي على زر “ضربة حظ” I’m Feeling Lucky و يحتوي على إعلانات استهدافية، حيث يقوم مروجو المخدرات بالتنافس على معدلات المرور.
     * – موسوعات الجريمة
     * موسوعات منظمة بعناية تحتوي على قوائم مبوبة بأنواع الجريمة، مثل الاختراق، الأسواق، الفيروسات، و المخدرات. يساعد الوصف المتاح لكل باب في تعريف القادمين الجدد بالموضوع و في توصيلهم بموادهم الإجرامية المفضلة.
     * – غرف الدردشة الخفية
     * مثل العالم الحقيقي تمامًا، كل مجرم يسعى للوصول إلى مواد إجرامية يجب أن يدخل من خلال توصية قبل أي تعامل معه. هناك شبكة من غرف الدردشة والمنتديات التي لا يمكن دخولها إلا من خلال دعوة، مخفاة خلف عناوين ويب غير مدرجة تتكون أسماؤها من حروف وأرقام، تتيح الدخول إلى أعتى الشبكات الإجرامية.
     * [1] ماريانا ترينش Mariana Trench هي أعمق نقطة في محيطات العالم، و تقع في غرب المحيط الهادي.
     * [2] ليكسيز-نيكسيز LexisNexis شركة نشر أميريكية تتيح قاعدة بيانات ضخمة للأبحاث القانونية و التجارية، تشمل النشرات والدراسات و التغطيات الإخبارية وغيرها.
     * [3] Pedophiles الأشخاص الذين ينجذبون جنسيًا إلى الأطفال
     * [4] Liberty Reserve شركة كانت تقدم خدمات الدفع الآمنة عبر الانترنت بواسطة العملات الرقمية، تم إغلاقها بواسطة حكومة الولايات المتحدة الأميريكية في 2013 بسبب استخدام خدماتها في أنشطة إجرامية لا يمكن تتبعها.
     * post_author : 1
     * post_excerpt :
     * post_date : December 20, 2016
     * post_date_gmt : December 20, 2016
     * comment_status : open
     * ping_status : open
     * post_name : %d8%a7%d9%84%d9%88%d9%8a%d8%a8-%d8%a7%d9%84%d8%ae%d9%81%d9%8a-%d8%a7%d9%84%d8%af%d9%8a%d8%a8-%d9%88%d9%8a%d8%a8
     * post_modified : December 20, 2016
     * post_modified_gmt : December 20, 2016
     * post_content_filtered :
     * post_parent : 0
     * menu_order : 0
     * comment_count : 0
     * featuredimage :
     * featuredthumb :
     * taxonomies : []
     * category : [{"id":"1","name":"Uncategorized","slug":"uncategorized","description":"","count":"11","parent":"0","image":"Plugin Categories Images must be enabled","custom_fields":"ACF plugin needs to be enabled, Back to documentation for further information"}]
     * tags : []
     * author : [{"ID":"1","user_login":"sabri","user_nicename":"sabri","user_email":"sabri.sniperdw@gmail.com","user_url":"","user_registered":"December 20, 2016","display_name":"sabri","role":{"administrator":true},"first_name":"","last_name":"","nickname":"sabri","description":"","avatar":"http://2.gravatar.com/avatar/2565f560c372c957c8a3a3426447b0bb?s=96&#038;d=mm&#038;r=g","aim":"","jabber":"","yim":"","custom_fields":"ACF plugin needs to be enabled, Back to documentation for further information"}]
     * post_format : false
     * custom_fields : ACF plugin needs to be enabled, Back to documentation for further information
     */

    @SerializedName("ID")
    private String ID;
    @SerializedName("post_title")
    private String postTitle;
    @SerializedName("guid")
    private String guid;
    @SerializedName("post_content")
    private String postContent;
    @SerializedName("post_author")
    private String postAuthor;
    @SerializedName("post_excerpt")
    private String postExcerpt;
    @SerializedName("post_date")
    private String postDate;
    @SerializedName("post_date_gmt")
    private String postDateGmt;
    @SerializedName("comment_status")
    private String commentStatus;
    @SerializedName("ping_status")
    private String pingStatus;
    @SerializedName("post_name")
    private String postName;
    @SerializedName("post_modified")
    private String postModified;
    @SerializedName("post_modified_gmt")
    private String postModifiedGmt;
    @SerializedName("post_content_filtered")
    private String postContentFiltered;
    @SerializedName("post_parent")
    private String postParent;
    @SerializedName("menu_order")
    private String menuOrder;
    @SerializedName("comment_count")
    private String commentCount;
    @SerializedName("featuredimage")
    private String featuredimage;
    @SerializedName("featuredthumb")
    private String featuredthumb;
    @SerializedName("post_format")
    private boolean postFormat;
    @SerializedName("custom_fields")
    private String customFields;
    @SerializedName("taxonomies")
    private List<?> taxonomies;
    @SerializedName("category")
    private List<Category> category;
    @SerializedName("tags")
    private List<?> tags;
    @SerializedName("author")
    private List<Author> author;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(String postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostModified() {
        return postModified;
    }

    public void setPostModified(String postModified) {
        this.postModified = postModified;
    }

    public String getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(String postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    public String getPostParent() {
        return postParent;
    }

    public void setPostParent(String postParent) {
        this.postParent = postParent;
    }

    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getFeaturedimage() {
        if (featuredimage.isEmpty())
            featuredimage = "http://www.google.com";
        return featuredimage;
    }

    public void setFeaturedimage(String featuredimage) {
        this.featuredimage = featuredimage;
    }

    public String getFeaturedthumb() {
        return featuredthumb;
    }

    public void setFeaturedthumb(String featuredthumb) {
        this.featuredthumb = featuredthumb;
    }

    public boolean isPostFormat() {
        return postFormat;
    }

    public void setPostFormat(boolean postFormat) {
        this.postFormat = postFormat;
    }

    public String getCustomFields() {
        return customFields;
    }

    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    public List<?> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<?> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<?> getTags() {
        return tags;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public static class Category {
        /**
         * id : 1
         * name : Uncategorized
         * slug : uncategorized
         * description :
         * count : 11
         * parent : 0
         * image : Plugin Categories Images must be enabled
         * custom_fields : ACF plugin needs to be enabled, Back to documentation for further information
         */

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("slug")
        private String slug;
        @SerializedName("description")
        private String description;
        @SerializedName("count")
        private String count;
        @SerializedName("parent")
        private String parent;
        @SerializedName("image")
        private String image;
        @SerializedName("custom_fields")
        private String customFields;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCustomFields() {
            return customFields;
        }

        public void setCustomFields(String customFields) {
            this.customFields = customFields;
        }
    }

    public static class Author {
        /**
         * ID : 1
         * user_login : sabri
         * user_nicename : sabri
         * user_email : sabri.sniperdw@gmail.com
         * user_url :
         * user_registered : December 20, 2016
         * display_name : sabri
         * role : {"administrator":true}
         * first_name :
         * last_name :
         * nickname : sabri
         * description :
         * avatar : http://2.gravatar.com/avatar/2565f560c372c957c8a3a3426447b0bb?s=96&#038;d=mm&#038;r=g
         * aim :
         * jabber :
         * yim :
         * custom_fields : ACF plugin needs to be enabled, Back to documentation for further information
         */

        @SerializedName("ID")
        private String ID;
        @SerializedName("user_login")
        private String userLogin;
        @SerializedName("user_nicename")
        private String userNicename;
        @SerializedName("user_email")
        private String userEmail;
        @SerializedName("user_url")
        private String userUrl;
        @SerializedName("user_registered")
        private String userRegistered;
        @SerializedName("display_name")
        private String displayName;
        @SerializedName("role")
        private Role role;
        @SerializedName("first_name")
        private String firstName;
        @SerializedName("last_name")
        private String lastName;
        @SerializedName("nickname")
        private String nickname;
        @SerializedName("description")
        private String description;
        @SerializedName("avatar")
        private String avatar;
        @SerializedName("aim")
        private String aim;
        @SerializedName("jabber")
        private String jabber;
        @SerializedName("yim")
        private String yim;
        @SerializedName("custom_fields")
        private String customFields;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getUserLogin() {
            return userLogin;
        }

        public void setUserLogin(String userLogin) {
            this.userLogin = userLogin;
        }

        public String getUserNicename() {
            return userNicename;
        }

        public void setUserNicename(String userNicename) {
            this.userNicename = userNicename;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserUrl() {
            return userUrl;
        }

        public void setUserUrl(String userUrl) {
            this.userUrl = userUrl;
        }

        public String getUserRegistered() {
            return userRegistered;
        }

        public void setUserRegistered(String userRegistered) {
            this.userRegistered = userRegistered;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAim() {
            return aim;
        }

        public void setAim(String aim) {
            this.aim = aim;
        }

        public String getJabber() {
            return jabber;
        }

        public void setJabber(String jabber) {
            this.jabber = jabber;
        }

        public String getYim() {
            return yim;
        }

        public void setYim(String yim) {
            this.yim = yim;
        }

        public String getCustomFields() {
            return customFields;
        }

        public void setCustomFields(String customFields) {
            this.customFields = customFields;
        }

        public static class Role {
            /**
             * administrator : true
             */

            @SerializedName("administrator")
            private boolean administrator;

            public boolean isAdministrator() {
                return administrator;
            }

            public void setAdministrator(boolean administrator) {
                this.administrator = administrator;
            }
        }
    }
}