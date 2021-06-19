package com.example.listviewnews

import android.R.attr.name
import android.R.id
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val news1 = news()
        news1.photo = R.drawable.news1
        news1.title =
            "الصراع الفلسطيني الإسرائيلي: مقتل ثلاثة فلسطينيين في جنين أثناء اشتباك مع القوات الإسرائيلية"
        news1.description =
            "قوات إسرائيلية خاصة تعرف بوحدة اليمام اقتحمت المدينة فجراً، في عملية استهدفت عنصراً في كتائب سرايا القدس"
        news1.publishDate = "2021-06-10T07:53:37Z"
        news1.link = "https://www.bbc.com/arabic/middleeast-57425596"

        val news2 = news()
        news2.photo = R.drawable.news2
        news2.title = "مسيرة الأعلام الإسرائيلية: ما هي ومن يقف وراءها وما الهدف منها؟"
        news2.description =
            "من المتوقع أن يقوم المتطرفون اليهود بما يسمى بـ \\\"مسيرة الأعلام\\\" في 15 يونيو الحالي في القدس لإحياء ذكرى احتلال إسرائيل للقدس الشرقية. فمن يقف وراء هذه المسيرة وما الهدف منها؟"
        news2.publishDate = "2021-06-12T12:57:00Z"
        news2.link = "https://www.bbc.com/arabic/middleeast-57440706"

        val news3 = news()
        news3.photo = R.drawable.news3
        news3.title = "غادة الكرمي وإيلين سيغل: حق العودة في صورة"
        news3.description =
            "غادة الكرمي وإيلين، صديقتان ومدافعتان عن حقّ عودة الفلسطينيين إلى بلادهم. صورهما انتشرت بشكل واسع قبل شهر مع عودة التوتر في القدس وفي قطاع غزّة"
        news3.publishDate = "2021-06-09T11:35:17Z"
        news3.link = "https://www.bbc.com/arabic/media-57415163"

        val news4 = news()
        news4.photo = R.drawable.news4
        news4.title =
            "إسرائيل والفلسطينيون: الحكومة الإسرائيلية توافق على مرور مسيرة الأعلام عبر الحي الإسلامي في القدس"
        news4.description =
            "مسيرة الأعلام، التي ينظمها الشبان اليهود القوميون، سوف تُنظم بعد يومين من تصويت الكنيست على الحكومة الإسرائيلية المرتقبة بقيادة السياسي القومي المتطرف نفتالي بينيت والوسطي يائير لابيد"
        news4.publishDate = "2021-06-08T23:02:55Z"
        news4.link = "https://www.bbc.com/arabic/middleeast-57395427"

        val news5 = news()
        news5.photo = R.drawable.news5
        news5.title =
            "بعد موافقة نتنياهو على مسيرة الأعلام.. الخارجية الفلسطينية: يُصعد العدوان لإنقاذ حكمه"
        news5.description =
            " وزارة الخارجية الفلسطينية أن رئيس الوزراء الإسرائيلي بنيامين نتنياهو يصعد \\\"العدوان\\\" على القدس ومقدساتها من أجل \\\"إنقاذ حكمه"
        news5.publishDate = "2021-06-09T04:32:54Z"
        news5.link =
            "https://arabic.cnn.com/middle-east/article/2021/06/09/palestinian-foreign-ministry-netanyahu-jerusalem"


        val news6 = news()
        news6.photo = R.drawable.news6
        news6.title = "الملحمة الفلسطينية.. حوار مع جوزيف مسعد بعد معركة «سيف القدس»"
        news6.description =
            "إعداد وتحرير: محمد عزت – زيد صافي – عبد الرحمن ناصر وكأن كلَّ شيء قد تبدَّل في عامٍ وأربعة أشهر فقط. ففي يناير (كانون الثاني) 2020، كان الرئيس الأمريكي دونالد ترامب والعديد من الزعماء في المنطقة يستعدُّون للاحتفال بالإعلان عن وفاة القضية الفلسطينية للأبد عبر …"
        news6.publishDate = "2021-06-11T21:03:20Z"
        news6.link = "https://www.sasapost.com/joseph-massad-on-the-palestinian-cause/"

        val news7 = news()
        news7.photo = R.drawable.news7
        news7.title = "شاهد لحظة ابتلاع حفرة لعدد من السيارات المتوقفة في ساحة مركز طبي في القدس"
        news7.description =
            "ابتلعت حفرة ظهرت فجأة في موقف للسيارات خارج مستشفى في القدس عدة سيارات متوقفة. ولم ترد أنباء عن وقوع إصابات بعد أن قامت الشرطة بالتحقيق في الموقع"
        news7.publishDate = "2021-06-08T18:56:24Z"
        news7.link =
            "https://arabic.cnn.com/middle-east/video/2021/06/08/v107010-jerusalem-sinkhole"

        val news8 = news()
        news8.photo = R.drawable.news8
        news8.title = "شاهد: عناصر من الجناح العسكري لحركة حماس في استعراض عسكري في غزة"
        news8.description = "شاهد: عناصر من الجناح العسكري لحركة حماس في استعراض عسكري في غزة"
        news8.publishDate = "2021-06-08T14:30:07Z"
        news8.link =
            "https://arabic.euronews.com/2021/06/08/video-military-wing-hamas-holds-military-parade-gaza"

        val news9 = news()
        news9.photo = R.drawable.news9
        news9.title = "شاهد: انهيار أرضي يبتلع عدة سيارات في موقف في إسرائيل"
        news9.description =
            "تشكلت حفرة عملاقة في موقف السيارات التابع للمركز الطبي \\\"شعاري زيديك\\\" في القدس بعد ظهر يوم الإثنين 7 يونيو/حزيران، مما أدى إلى سقوط عدد من السيارات داخلها"
        news9.publishDate = "2021-06-08T21:00:25Z"
        news9.link =
            "https://arabic.euronews.com/2021/06/08/watch-sinkhole-in-israeli-hospital-garage-swallows-cars"

        val news10 = news()
        news10.photo = R.drawable.news10
        news10.title =
            "شاهد: حريق كبير يندلع قرب القدس والسلطات الإسرائيلية تجلي السكّان من عدة قرى"
        news10.description =
            "لم يعرف على الفور سبب الحريق الذي انتشر في أحراج على مقربة من مناطق كثيفة السكان، فيما تصاعدت أعمدة الدخان الأسود في السماء فوق التلال المتاخمة للقدس"
        news10.publishDate = "2021-06-09T17:04:10Z"
        news10.link =
            "https://arabic.euronews.com/2021/06/09/firefighting-plane-extinguishing-fire-raging-near-jerusalem"

        val news11 = news()
        news11.photo = R.drawable.news11
        news11.title = "الحكومة الإسرائيلية تجيز مسيرة مثيرة للجدل لليمين المتطرف في القدس"
        news11.description = "الحكومة الإسرائيلية تجيز مسيرة مثيرة للجدل لليمين المتطرف في القدس"
        news11.publishDate = "2021-06-08T19:14:29Z"
        news11.link =
            "https://arabic.euronews.com/2021/06/08/israel-authorizes-controversial-right-wing-march-in-jerusalem"

        val news12 = news()
        news12.photo = R.drawable.news12
        news12.title = "مخاوف أهالي الشيخ جراح مستمرة مع احتمال إخلاء منازلهم لصالح مستوطنين"
        news12.description =
            "أصبح اسم حي الشيخ جراح معروفا في العالم في الفترة الأخيرة، لكن الخوف لا يزال يسيطر على الفلسطيني عارف حماد (70 عاما) وهو ينتظر قرار محكمة قد يؤدي إلى طرده من بيته في القدس الشرقية المحتلة بعدما عاش فيه لعقود"
        news12.publishDate = "2021-06-11T17:00:11Z"
        news12.link =
            "https://arabic.euronews.com/2021/06/11/palestinians-in-jerusalem-s-sheikh-jarrah-fear-for-future"

        val news13 = news()
        news13.photo = R.drawable.news13
        news13.title = "حرس الحدود الاسرائيلي يقتل امرأة تحمل سكينا في الضفة الغربية المحتلة"
        news13.description = "حرس الحدود الاسرائيلي يقتل امرأة تحمل سكينا في الضفة الغربية المحتلة"
        news13.publishDate = "2021-06-12T14:25:13Z"
        news13.link =
            "https://arabic.euronews.com/2021/06/12/israeli-border-patrol-shoot-woman-holding-knife"

        val news14 = news()
        news14.photo = R.drawable.news14
        news14.title = "إسرائيل تطوي حقبة نتنياهو وتترقب أجندة رئيس الوزراء الجديد"
        news14.description =
            "لقد أطاح الائتلاف الذي يضم أحزابًا إسرائيلية متباينة في توجهاتها وتشكيلة من قدامى القادة السياسيين وعددا كبيرا من النساء بنتنياهو، بعد أن اجتمعت أطرافه حول مهمة إنهاء حياته السياسية"
        news14.publishDate = "2021-06-14T15:05:27Z"
        news14.link =
            "https://arabic.euronews.com/2021/06/14/israel-turns-netanyahu-era-awaits-new-prime-minister-agenda"

        val news15 = news()
        news15.photo = R.drawable.news15
        news15.title = "شاهد: صورة للحكومة الإسرائيلية الجديدة إلى جانب الرئيس رؤوفين ريفلين"
        news15.description =
            "تداولت وسائل الإعلام صورة جماعية للحكومة الإسرائيلية المشكلة حديثا بقيادة القومي اليميني نفتالي بينيت بمقر إقامة الرئيس في القدس بعد تحالف متنوع للأحزاب الإسرائيلية أنهى 12 عاما لهيمنة نتانياهو على منصب رئيس للوزراء"
        news15.publishDate = "2021-06-14T11:15:29Z"
        news15.link =
            "https://arabic.euronews.com/2021/06/14/israel-s-new-coalition-govt-pose-for-group-photo"

        val newsList = arrayListOf<news>(
            news1,
            news2,
            news3,
            news4,
            news5,
            news6,
            news7,
            news8,
            news9,
            news10,
            news11,
            news12,
            news13,
            news14,
            news15
        )

        val adpter = newsadapter(R.layout.rownews_item, newsList, this)

        newslistView.adapter = adpter
        val headedrView = LayoutInflater.from(applicationContext).inflate(
            R.layout.listviewheader,
            null
        )
        newslistView.addHeaderView(headedrView)

        newslistView.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                val n = newsList.get(position)
                val i = Intent(application, deteils_Activity::class.java)
                i.putExtra("desc", n.description)
                i.putExtra("link", n.link)
                startActivity(i)

            }
        })


    }
}
